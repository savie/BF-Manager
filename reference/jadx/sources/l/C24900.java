package l;

import java.util.IdentityHashMap;
import java.util.function.Consumer;

/* JADX INFO: renamed from: l.᩻۟᩸, reason: contains not printable characters */
/* JADX INFO: compiled from: K6U1 */
/* JADX INFO: loaded from: classes.dex */
public final class C24900 {

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public long f80572;

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public C23408 f80573;

    /* JADX INFO: renamed from: ܳ, reason: not valid java name and contains not printable characters */
    public C23408 f80574;

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final IdentityHashMap f80576 = new IdentityHashMap();

    /* JADX INFO: renamed from: ᩴ, reason: not valid java name and contains not printable characters */
    public final C1779 f80575 = new C1779(0, this);

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public final C11473 f80577 = new Consumer() { // from class: l.ۧ۟᩸
        @Override // java.util.function.Consumer
        public final void accept(Object obj) {
            this.f36083.m55478(obj);
        }

        public /* synthetic */ Consumer andThen(Consumer consumer) {
            return C12312.$default$andThen(this, consumer);
        }
    };

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final long m55481() {
        return this.f80572;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m55482(C20424 c20424, C20424 c20425) {
        C23408 c23408 = this.f80574;
        C23408 c23409 = c20424.f65428;
        if (c23408 == c23409 && this.f80573 == c20425.f65428) {
            return;
        }
        m55477(c23409);
        m55477(c20425.f65428);
        m55478(this.f80574);
        m55478(this.f80573);
        this.f80574 = c20424.f65428;
        this.f80573 = c20425.f65428;
    }

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final void m55483() {
        m55482(new C20424(), new C20424());
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public void m55477(Object obj) {
        if (obj == null) {
            return;
        }
        IdentityHashMap identityHashMap = this.f80576;
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
        this.f80572 += m55474(obj);
        boolean z = obj instanceof C7810;
        if ((z || (obj instanceof C5311)) && !z) {
            ((C5311) obj).m15952();
        }
        m55475(obj, true);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public void m55478(Object obj) {
        if (obj == null) {
            return;
        }
        IdentityHashMap identityHashMap = this.f80576;
        Integer num = (Integer) identityHashMap.get(obj);
        if (num == null) {
            throw new IllegalStateException("Unbalanced history budget release");
        }
        if (num.intValue() > 1) {
            identityHashMap.put(obj, Integer.valueOf(num.intValue() - 1));
            return;
        }
        identityHashMap.remove(obj);
        this.f80572 -= m55474(obj);
        boolean z = obj instanceof C7810;
        if ((z || (obj instanceof C5311)) && !z) {
            ((C5311) obj).m15952();
        }
        m55475(obj, false);
    }

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    private void m55479(Object obj, boolean z) {
        if (z) {
            m55477(obj);
        } else {
            m55478(obj);
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    private void m55475(Object obj, boolean z) {
        if (obj instanceof C23408) {
            C23408 c23408 = (C23408) obj;
            Object obj2 = c23408.f75775;
            if (obj2 != null) {
                m55479(obj2, z);
                return;
            } else {
                m55479(c23408.f75771, z);
                m55479(c23408.f75773, z);
                return;
            }
        }
        if (obj instanceof C20489) {
            m55479(((C20489) obj).f65630.f65428, z);
            return;
        }
        if (obj instanceof C10727) {
            C10727 c10727 = (C10727) obj;
            m55479(c10727.f34067, z);
            m55479(c10727.f34068, z);
            m55479(c10727.f34064, z);
            return;
        }
        C24460.m54715(obj, z ? this.f80575 : this.f80577);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static long m55474(Object obj) {
        if (obj instanceof C21498) {
            return 72L;
        }
        if (obj instanceof C10727) {
            return 128L;
        }
        if ((obj instanceof C20489) || (obj instanceof C23408)) {
            return 104L;
        }
        return C24460.m54714(obj);
    }
}
