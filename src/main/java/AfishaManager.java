public class AfishaManager {
    private AfishaManager manager;
    private CoverItem[] items = new CoverItem[0];
    private int limit;

    public AfishaManager() {
        this.limit = 5;
    }

    public AfishaManager(int limit) {
        this.limit = limit;
    }

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
        int resultLength;
        if (items.length > limit) {
            resultLength = limit;
        } else {
            resultLength = items.length;
        }
        CoverItem[] reversed = new CoverItem[resultLength];
        for (int i = 0; i < reversed.length; i++) {
            reversed[i] = items[items.length - 1 - i];
        }
        return reversed;
    }

}

