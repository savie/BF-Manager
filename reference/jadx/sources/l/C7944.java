package l;

import android.widget.Filter;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: renamed from: l.۟ܰ᩻, reason: contains not printable characters */
/* JADX INFO: compiled from: N155 */
/* JADX INFO: loaded from: classes3.dex */
public final class C7944 extends Filter {

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C19131 f26417;

    public C7944(C19131 c19131) {
        this.f26417 = c19131;
    }

    @Override // android.widget.Filter
    public final Filter.FilterResults performFiltering(CharSequence charSequence) {
        ArrayList arrayList;
        ArrayList arrayList2;
        Filter.FilterResults filterResults = new Filter.FilterResults();
        if (this.f26417.f61911 == null) {
            synchronized (this.f26417.f61915) {
                this.f26417.f61911 = new ArrayList(this.f26417.f61908);
            }
        }
        if (charSequence == null || charSequence.length() == 0) {
            synchronized (this.f26417.f61915) {
                arrayList = new ArrayList(this.f26417.f61911);
            }
            filterResults.values = arrayList;
            filterResults.count = arrayList.size();
            return filterResults;
        }
        String lowerCase = charSequence.toString().toLowerCase();
        synchronized (this.f26417.f61915) {
            arrayList2 = new ArrayList(this.f26417.f61911);
        }
        int size = arrayList2.size();
        ArrayList arrayList3 = new ArrayList();
        for (int i = 0; i < size; i++) {
            Object obj = arrayList2.get(i);
            String lowerCase2 = obj.toString().toLowerCase();
            if (lowerCase2.startsWith(lowerCase)) {
                arrayList3.add(obj);
            } else {
                for (String str : lowerCase2.split(" ")) {
                    if (str.startsWith(lowerCase)) {
                        arrayList3.add(obj);
                        break;
                    }
                }
            }
        }
        filterResults.values = arrayList3;
        filterResults.count = arrayList3.size();
        return filterResults;
    }

    @Override // android.widget.Filter
    public final void publishResults(CharSequence charSequence, Filter.FilterResults filterResults) {
        List list = (List) filterResults.values;
        C19131 c19131 = this.f26417;
        c19131.f61908 = list;
        if (filterResults.count > 0) {
            c19131.notifyDataSetChanged();
        } else {
            c19131.notifyDataSetInvalidated();
        }
    }
}
