package l;

import java.util.Arrays;
import java.util.concurrent.locks.ReentrantLock;

/* JADX INFO: renamed from: l.֫ۛ۠, reason: contains not printable characters */
/* JADX INFO: compiled from: 1ALL */
/* JADX INFO: loaded from: classes3.dex */
public final class C1634 extends AbstractC5868 {
    public volatile /* synthetic */ int size;

    /* JADX INFO: renamed from: ۖ, reason: not valid java name and contains not printable characters */
    public int f6549;

    /* JADX INFO: renamed from: ۚ, reason: not valid java name and contains not printable characters */
    public final ReentrantLock f6550;

    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    public final int f6551;

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public Object[] f6552;

    /* JADX INFO: renamed from: ᩹, reason: not valid java name and contains not printable characters */
    public final EnumC9397 f6553;

    @Override // l.AbstractC5868
    /* JADX INFO: renamed from: ᩹, reason: not valid java name and contains not printable characters */
    public final boolean mo5526() {
        return false;
    }

    @Override // l.AbstractC5868
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final boolean mo5525(AbstractC1073 abstractC1073) {
        ReentrantLock reentrantLock = this.f6550;
        reentrantLock.lock();
        try {
            return super.mo5525(abstractC1073);
        } finally {
            reentrantLock.unlock();
        }
    }

    @Override // l.AbstractC5868
    /* JADX INFO: renamed from: ֨, reason: not valid java name and contains not printable characters */
    public final boolean mo5521() {
        return this.size == 0;
    }

    @Override // l.AbstractC23508
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final Object mo5523(C5331 c5331) {
        C21203 c21203 = C10808.f36821;
        ReentrantLock reentrantLock = this.f6550;
        reentrantLock.lock();
        try {
            int i = this.size;
            C2484 c2484M51762 = m51762();
            if (c2484M51762 != null) {
                reentrantLock.unlock();
                return c2484M51762;
            }
            C21203 c21204 = null;
            if (i < this.f6551) {
                this.size = i + 1;
            } else {
                int i2 = C14336.f46960[this.f6553.ordinal()];
                if (i2 == 1) {
                    c21204 = C10808.f36822;
                } else if (i2 == 2) {
                    c21204 = c21203;
                } else if (i2 != 3) {
                    throw new C22844();
                }
            }
            if (c21204 != null) {
                reentrantLock.unlock();
                return c21204;
            }
            if (i == 0) {
                while (true) {
                    InterfaceC13069 interfaceC13069M51758 = m51758();
                    if (interfaceC13069M51758 == null) {
                        break;
                    }
                    if (interfaceC13069M51758 instanceof C2484) {
                        this.size = i;
                        reentrantLock.unlock();
                        return interfaceC13069M51758;
                    }
                    if (interfaceC13069M51758.mo7613(c5331) != null) {
                        this.size = i;
                        C7321 c7321 = C7321.f24318;
                        reentrantLock.unlock();
                        interfaceC13069M51758.mo7612(c5331);
                        return interfaceC13069M51758.mo4050();
                    }
                }
            }
            m5520(i, c5331);
            reentrantLock.unlock();
            return c21203;
        } catch (Throwable th) {
            reentrantLock.unlock();
            throw th;
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    private final void m5520(int i, C5331 c5331) {
        int i2 = this.f6551;
        if (i >= i2) {
            Object[] objArr = this.f6552;
            int i3 = this.f6549;
            objArr[i3 % objArr.length] = null;
            objArr[(i + i3) % objArr.length] = c5331;
            this.f6549 = (i3 + 1) % objArr.length;
            return;
        }
        Object[] objArr2 = this.f6552;
        if (i >= objArr2.length) {
            int iMin = Math.min(objArr2.length * 2, i2);
            Object[] objArr3 = new Object[iMin];
            for (int i4 = 0; i4 < i; i4++) {
                Object[] objArr4 = this.f6552;
                objArr3[i4] = objArr4[(this.f6549 + i4) % objArr4.length];
            }
            Arrays.fill(objArr3, i, iMin, C10808.f36820);
            this.f6552 = objArr3;
            this.f6549 = 0;
        }
        Object[] objArr5 = this.f6552;
        objArr5[(this.f6549 + i) % objArr5.length] = c5331;
    }

    @Override // l.AbstractC5868
    /* JADX INFO: renamed from: ۘ, reason: not valid java name and contains not printable characters */
    public final Object mo5522() {
        Object objMo7614;
        AbstractC3895 abstractC3895M51759;
        boolean z;
        Object obj = C10808.f36819;
        ReentrantLock reentrantLock = this.f6550;
        reentrantLock.lock();
        try {
            int i = this.size;
            if (i == 0) {
                C2484 c2484M51762 = m51762();
                if (c2484M51762 != null) {
                    obj = c2484M51762;
                }
                reentrantLock.unlock();
                return obj;
            }
            Object[] objArr = this.f6552;
            int i2 = this.f6549;
            Object obj2 = objArr[i2];
            objArr[i2] = null;
            this.size = i - 1;
            if (i != this.f6551 || (abstractC3895M51759 = m51759()) == null) {
                objMo7614 = obj;
                abstractC3895M51759 = null;
                z = false;
            } else {
                objMo7614 = abstractC3895M51759.mo7614();
                z = true;
            }
            if (objMo7614 != obj && !(objMo7614 instanceof C2484)) {
                this.size = i;
                Object[] objArr2 = this.f6552;
                objArr2[(this.f6549 + i) % objArr2.length] = objMo7614;
            }
            this.f6549 = (this.f6549 + 1) % this.f6552.length;
            C7321 c7321 = C7321.f24318;
            reentrantLock.unlock();
            if (z) {
                C13465.m32962(abstractC3895M51759);
            }
            return obj2;
        } catch (Throwable th) {
            reentrantLock.unlock();
            throw th;
        }
    }

    @Override // l.AbstractC23508
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final String mo5524() {
        return "(buffer:capacity=" + this.f6551 + ",size=" + this.size + ')';
    }

    public C1634(int i, EnumC9397 enumC9397) {
        this.f6551 = i;
        this.f6553 = enumC9397;
        if (i < 1) {
            throw new IllegalArgumentException(C2271.m6966(i, "ArrayChannel capacity must be at least 1, but ", " was specified").toString());
        }
        this.f6550 = new ReentrantLock();
        int iMin = Math.min(i, 8);
        Object[] objArr = new Object[iMin];
        Arrays.fill(objArr, 0, iMin, C10808.f36820);
        this.f6552 = objArr;
        this.size = 0;
    }
}
