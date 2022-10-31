import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class Repository<T extends Entidade> {
    private List<T> itens = new ArrayList<T>();

    public void add(T item) {
        if (!Objects.isNull(item)) {
            item.setId(getNextId());
            this.itens.add(item);
        }
    }

    public void remove(Integer id) throws Exception { 
        T item = get(id);
        itens.remove(item);
    }

    public T get(int id) throws Exception {
        for (T item : this.itens) {
            if (item.getId() == id) {
                return item;
            }
        }
        throw new Exception("Item não encontrada");
    }

    public List<T> getAll() {
        return itens;
    }

    public int getNextId() {
        int id = 0;
        for (Entidade object : itens) {
            if (object.getId() > id) {
                id = object.getId();
            }
        }
        return id + 1;
    }
}
