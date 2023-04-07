public class AfishaManager {
    private AfishaManager manager;

    private CoverItem[] items = new CoverItem[0];

    public void saveCover(CoverItem item) {
        CoverItem[] tmp = new CoverItem[items.length + 1];
        for (int i = 0; i < items.length; i++) {
            tmp[i] = items[i];
        }
        tmp[tmp.length - 1] = item;
        items = tmp;
    }

    public CoverItem[] findAll() {
        return items;
    }
    public CoverItem[] findLast() {
        CoverItem[] reversed = new CoverItem[findAll().length];
        for (int i = 0;i < reversed.length; i++) {
            reversed[i] = items[findAll().length - 1 - i];
        }
        return reversed;
    }

}

