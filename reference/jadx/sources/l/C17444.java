package l;

import android.view.View;
import android.view.ViewGroup;
import java.util.Iterator;

/* JADX INFO: renamed from: l.ܽ۠, reason: contains not printable characters */
/* JADX INFO: compiled from: E9O4 */
/* JADX INFO: loaded from: classes4.dex */
public final class C17444 implements Iterator {

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ ViewGroup f56738;

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public int f56739;

    public C17444(ViewGroup viewGroup) {
        this.f56738 = viewGroup;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.f56739 < this.f56738.getChildCount();
    }

    @Override // java.util.Iterator
    public final Object next() {
        int i = this.f56739;
        this.f56739 = i + 1;
        View childAt = this.f56738.getChildAt(i);
        if (childAt != null) {
            return childAt;
        }
        throw new IndexOutOfBoundsException();
    }

    @Override // java.util.Iterator
    public final void remove() {
        int i = this.f56739 - 1;
        this.f56739 = i;
        this.f56738.removeViewAt(i);
    }
}
