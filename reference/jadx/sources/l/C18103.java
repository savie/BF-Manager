package l;

import android.view.View;
import android.view.ViewGroup;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.NoSuchElementException;

/* JADX INFO: renamed from: l.ᩳܳ, reason: contains not printable characters */
/* JADX INFO: compiled from: E9O4 */
/* JADX INFO: loaded from: classes4.dex */
public final class C18103 implements Iterator {

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public Iterator f57889;

    /* JADX INFO: renamed from: ܺ, reason: not valid java name and contains not printable characters */
    public final InterfaceC15456 f57888 = C21259.f69227;

    /* JADX INFO: renamed from: ֡, reason: not valid java name and contains not printable characters */
    public final ArrayList f57887 = new ArrayList();

    @Override // java.util.Iterator
    public final void remove() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    public C18103(C17731 c17731) {
        this.f57889 = c17731;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.f57889.hasNext();
    }

    @Override // java.util.Iterator
    public final Object next() {
        Object next = this.f57889.next();
        View view = (View) next;
        ViewGroup viewGroup = view instanceof ViewGroup ? (ViewGroup) view : null;
        C17731 c17731 = viewGroup != null ? new C17731(viewGroup) : null;
        ArrayList arrayList = this.f57887;
        if (c17731 != null && c17731.hasNext()) {
            arrayList.add(this.f57889);
            this.f57889 = c17731;
            return next;
        }
        while (!this.f57889.hasNext() && !arrayList.isEmpty()) {
            if (!arrayList.isEmpty()) {
                this.f57889 = (Iterator) arrayList.get(C4892.m13615((List) arrayList));
                if (arrayList.isEmpty()) {
                    throw new NoSuchElementException("List is empty.");
                }
                arrayList.remove(C4892.m13615((List) arrayList));
            } else {
                throw new NoSuchElementException("List is empty.");
            }
        }
        return next;
    }
}
