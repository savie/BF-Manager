package l;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: renamed from: l.ᩳۗۨ, reason: contains not printable characters */
/* JADX INFO: compiled from: 87IM */
/* JADX INFO: loaded from: classes4.dex */
public final class C18792 extends IOException implements Iterable {
    public static final long serialVersionUID = 1;

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public static final /* synthetic */ int f61026 = 0;

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final List f61027;

    /* JADX WARN: Illegal instructions before constructor call */
    public C18792(String str, List list) {
        if (str == null) {
            str = String.format("%,d exception(s): %s", Integer.valueOf(list != null ? list.size() : 0), list);
        }
        super(str, (list != null ? list.size() : 0) == 0 ? null : (Throwable) list.get(0));
        this.f61027 = list == null ? Collections.EMPTY_LIST : list;
    }

    @Override // java.lang.Iterable
    public final Iterator iterator() {
        return new ArrayList(this.f61027).iterator();
    }
}
