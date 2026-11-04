package l;

import android.view.View;
import android.view.ViewGroup;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.NoSuchElementException;

/* JADX INFO: renamed from: l.᩹ۖ, reason: contains not printable characters */
/* JADX INFO: compiled from: E9O4 */
/* JADX INFO: loaded from: classes.dex */
public final class C23237 implements Iterator {

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final InterfaceC3071 f75263 = C16698.f53947;

    /* JADX INFO: renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public final ArrayList f75264 = new ArrayList();

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public Iterator f75265;

    @Override // java.util.Iterator
    public final void remove() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    public C23237(C17444 c17444) {
        this.f75265 = c17444;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.f75265.hasNext();
    }

    @Override // java.util.Iterator
    public final Object next() {
        Object next = this.f75265.next();
        View view = (View) next;
        ViewGroup viewGroup = view instanceof ViewGroup ? (ViewGroup) view : null;
        C17444 c17444 = viewGroup != null ? new C17444(viewGroup) : null;
        ArrayList arrayList = this.f75264;
        if (c17444 != null && c17444.hasNext()) {
            arrayList.add(this.f75265);
            this.f75265 = c17444;
            return next;
        }
        while (!this.f75265.hasNext() && !arrayList.isEmpty()) {
            if (!arrayList.isEmpty()) {
                this.f75265 = (Iterator) arrayList.get(C7743.m21085((List) arrayList));
                if (arrayList.isEmpty()) {
                    throw new NoSuchElementException("List is empty.");
                }
                arrayList.remove(C7743.m21085((List) arrayList));
            } else {
                throw new NoSuchElementException("List is empty.");
            }
        }
        return next;
    }
}
