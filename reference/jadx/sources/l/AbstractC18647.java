package l;

import java.util.function.Consumer;

/* JADX INFO: renamed from: l.ܿ᩹᩹, reason: contains not printable characters */
/* JADX INFO: compiled from: 97L */
/* JADX INFO: loaded from: classes4.dex */
public abstract class AbstractC18647 {

    /* JADX INFO: renamed from: ֡, reason: not valid java name and contains not printable characters */
    public boolean f60634;

    /* JADX INFO: renamed from: ۟, reason: not valid java name and contains not printable characters */
    public int f60635;

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public int f60636;

    /* JADX INFO: renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public int f60637;

    /* JADX INFO: renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C19393 f60638;

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public boolean f60639;

    /* JADX INFO: renamed from: ۙ */
    public abstract AbstractC18647 mo12138(int i, int i2, boolean z);

    /* JADX INFO: renamed from: ۙ */
    public abstract void mo12139(int i, Object obj);

    public AbstractC18647(C19393 c19393) {
        this.f60638 = c19393;
        this.f60635 = 0;
        this.f60637 = c19393.f62674;
        this.f60636 = 0;
        this.f60634 = c19393.f62676;
        this.f60639 = false;
    }

    public AbstractC18647(C19393 c19393, int i, int i2, boolean z) {
        this.f60638 = c19393;
        this.f60636 = 0;
        this.f60635 = i;
        this.f60637 = i2;
        this.f60634 = z;
        this.f60639 = true;
    }

    public final boolean tryAdvance(Object obj) {
        boolean z = this.f60634;
        C19393 c19393 = this.f60638;
        if (z) {
            this.f60634 = false;
            this.f60636++;
            mo12139(c19393.f62674, obj);
            return true;
        }
        char[] cArr = c19393.f62668;
        while (true) {
            int i = this.f60635;
            if (i >= this.f60637) {
                return false;
            }
            if (cArr[i] != 0) {
                this.f60636++;
                this.f60635 = i + 1;
                mo12139(i, obj);
                return true;
            }
            this.f60635 = i + 1;
        }
    }

    public final void forEachRemaining(Object obj) {
        boolean z = this.f60634;
        C19393 c19393 = this.f60638;
        if (z) {
            this.f60634 = false;
            this.f60636++;
            mo12139(c19393.f62674, obj);
        }
        char[] cArr = c19393.f62668;
        while (true) {
            int i = this.f60635;
            if (i >= this.f60637) {
                return;
            }
            if (cArr[i] != 0) {
                mo12139(i, obj);
                this.f60636++;
            }
            this.f60635++;
        }
    }

    public final long estimateSize() {
        boolean z = this.f60639;
        C19393 c19393 = this.f60638;
        if (!z) {
            return c19393.f62670 - this.f60636;
        }
        int i = c19393.f62670;
        long j = i - this.f60636;
        if (c19393.f62676) {
            i--;
        }
        return Math.min(j, ((long) ((((double) i) / ((double) c19393.f62674)) * ((double) (this.f60637 - this.f60635)))) + (this.f60634 ? 1L : 0L));
    }

    /* JADX INFO: renamed from: trySplit, reason: collision with other method in class */
    public final AbstractC18647 m43409trySplit() {
        int i;
        int i2 = this.f60635;
        int i3 = this.f60637;
        if (i2 >= i3 - 1 || (i = (i3 - i2) >> 1) <= 1) {
            return null;
        }
        int i4 = i + i2;
        AbstractC18647 abstractC18647Mo12138 = mo12138(i2, i4, this.f60634);
        this.f60635 = i4;
        this.f60634 = false;
        this.f60639 = true;
        return abstractC18647Mo12138;
    }

    public /* bridge */ /* synthetic */ void forEachRemaining(Consumer consumer) {
        forEachRemaining((Object) consumer);
    }

    public /* bridge */ /* synthetic */ boolean tryAdvance(Consumer consumer) {
        return tryAdvance((Object) consumer);
    }

    public /* bridge */ /* synthetic */ InterfaceC8409 trySplit() {
        return (InterfaceC8409) m43409trySplit();
    }

    /* JADX INFO: renamed from: trySplit, reason: collision with other method in class */
    public /* bridge */ /* synthetic */ InterfaceC9154 m43408trySplit() {
        return (InterfaceC9154) m43409trySplit();
    }
}
