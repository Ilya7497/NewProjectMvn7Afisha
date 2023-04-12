public class AfishaManager {
    private AfishaManager manager;
    private CoverItem[] items = new CoverItem[0];
    private int limit;

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
        if (items.length > 5) {
            resultLength = 5;
        } else {
            resultLength = items.length;
        }
        CoverItem[] reversed = new CoverItem[resultLength];
        for (int i = 0; i < reversed.length; i++) {
            reversed[i] = items[items.length - 1 - i];
        }
        return reversed;
    }

    public CoverItem[] findLastIfLimit(int limit) {
        this.limit = limit;
        int resultLength;
        if (items.length < limit) {
            resultLength = items.length;
        } else {
            resultLength = limit;
        }
        CoverItem[] reversed = new CoverItem[resultLength];
        for (int i = 0; i < reversed.length; i++) {
            reversed[i] = items[items.length - 1 - i];
        }
        return reversed;
    }

}

