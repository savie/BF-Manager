package l;

import android.view.View;
import android.view.ViewGroup;
import java.util.Iterator;

/* JADX INFO: renamed from: l.ᩳ֫, reason: contains not printable characters */
/* JADX INFO: compiled from: E9O4 */
/* JADX INFO: loaded from: classes4.dex */
public final class C17731 implements Iterator {

    /* JADX INFO: renamed from: ܺ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ ViewGroup f56269;

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public int f56270;

    public C17731(ViewGroup viewGroup) {
        this.f56269 = viewGroup;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.f56270 < this.f56269.getChildCount();
    }

    @Override // java.util.Iterator
    public final Object next() {
        int i = this.f56270;
        this.f56270 = i + 1;
        View childAt = this.f56269.getChildAt(i);
        if (childAt != null) {
            return childAt;
        }
        throw new IndexOutOfBoundsException();
    }

    @Override // java.util.Iterator
    public final void remove() {
        int i = this.f56270 - 1;
        this.f56270 = i;
        this.f56269.removeViewAt(i);
    }
}
