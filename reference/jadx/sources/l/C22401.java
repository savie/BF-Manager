package l;

import java.util.IdentityHashMap;
import java.util.function.Consumer;

/* JADX INFO: renamed from: l.᩹ܽۖ, reason: contains not printable characters */
/* JADX INFO: compiled from: K6U1 */
/* JADX INFO: loaded from: classes.dex */
public final class C22401 {

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public long f73113;

    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    public C6878 f73115;

    /* JADX INFO: renamed from: ᩹, reason: not valid java name and contains not printable characters */
    public C6878 f73117;

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final IdentityHashMap f73116 = new IdentityHashMap();

    /* JADX INFO: renamed from: ۚ, reason: not valid java name and contains not printable characters */
    public final C2644 f73114 = new C2644(0, this);

    /* JADX INFO: renamed from: ۖ, reason: not valid java name and contains not printable characters */
    public final C5467 f73112 = new Consumer() { // from class: l.ۚܽۖ
        @Override // java.util.function.Consumer
        public final void accept(Object obj) {
            this.f18838.m49678(obj);
        }

        public /* synthetic */ Consumer andThen(Consumer consumer) {
            return C1455.$default$andThen(this, consumer);
        }
    };

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final long m49681() {
        return this.f73113;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m49682(C15346 c15346, C15346 c15347) {
        C6878 c6878 = this.f73117;
        C6878 c6879 = c15346.f49958;
        if (c6878 == c6879 && this.f73115 == c15347.f49958) {
            return;
        }
        m49677(c6879);
        m49677(c15347.f49958);
        m49678(this.f73117);
        m49678(this.f73115);
        this.f73117 = c15346.f49958;
        this.f73115 = c15347.f49958;
    }

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final void m49683() {
        m49682(new C15346(), new C15346());
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    public void m49677(Object obj) {
        if (obj == null) {
            return;
        }
        IdentityHashMap identityHashMap = this.f73116;
        Integer num = (Integer) identityHashMap.get(obj);
        if (num != null) {
            long jIntValue = ((long) num.intValue()) + ((long) 1);
            int i = (int) jIntValue;
            if (jIntValue != i) {
                throw new ArithmeticException();
            }
            identityHashMap.put(obj, Integer.valueOf(i));
            return;
        }
        identityHashMap.put(obj, 1);
        this.f73113 += m49674(obj);
        boolean z = obj instanceof C7605;
        if ((z || (obj instanceof C13625)) && !z) {
            ((C13625) obj).m33308();
        }
        m49675(obj, true);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public void m49678(Object obj) {
        if (obj == null) {
            return;
        }
        IdentityHashMap identityHashMap = this.f73116;
        Integer num = (Integer) identityHashMap.get(obj);
        if (num == null) {
            throw new IllegalStateException("Unbalanced history budget release");
        }
        if (num.intValue() > 1) {
            identityHashMap.put(obj, Integer.valueOf(num.intValue() - 1));
            return;
        }
        identityHashMap.remove(obj);
        this.f73113 -= m49674(obj);
        boolean z = obj instanceof C7605;
        if ((z || (obj instanceof C13625)) && !z) {
            ((C13625) obj).m33308();
        }
        m49675(obj, false);
    }

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    private void m49679(Object obj, boolean z) {
        if (z) {
            m49677(obj);
        } else {
            m49678(obj);
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    private void m49675(Object obj, boolean z) {
        if (obj instanceof C6878) {
            C6878 c6878 = (C6878) obj;
            Object obj2 = c6878.f23174;
            if (obj2 != null) {
                m49679(obj2, z);
                return;
            } else {
                m49679(c6878.f23173, z);
                m49679(c6878.f23175, z);
                return;
            }
        }
        if (obj instanceof C23128) {
            m49679(((C23128) obj).f75113.f49958, z);
            return;
        }
        if (obj instanceof C1463) {
            C1463 c1463 = (C1463) obj;
            m49679(c1463.f5959, z);
            m49679(c1463.f5966, z);
            m49679(c1463.f5961, z);
            return;
        }
        C18271.m42458(obj, z ? this.f73114 : this.f73112);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static long m49674(Object obj) {
        if (obj instanceof C8872) {
            return 72L;
        }
        if (obj instanceof C1463) {
            return 128L;
        }
        if ((obj instanceof C23128) || (obj instanceof C6878)) {
            return 104L;
        }
        return C18271.m42457(obj);
    }
}
