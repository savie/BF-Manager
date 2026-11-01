package l;

import java.io.InvalidObjectException;
import java.io.ObjectInputStream;
import java.io.Serializable;
import java.util.Map;
import java.util.NoSuchElementException;

/* JADX INFO: renamed from: l.֡ܿܶ, reason: contains not printable characters */
/* JADX INFO: compiled from: V5XH */
/* JADX INFO: loaded from: classes2.dex */
public class C0559 implements InterfaceC3196, Serializable {
    public static final long serialVersionUID = 0;

    /* JADX INFO: renamed from: ֡, reason: not valid java name and contains not printable characters */
    public static final /* synthetic */ int f2335 = 0;

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public static final C0559 f2336;

    /* JADX INFO: renamed from: ܺ, reason: not valid java name and contains not printable characters */
    public final transient AbstractC22433 f2337;

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public final transient AbstractC22433 f2338;

    static {
        int i = AbstractC22433.f73217;
        AbstractC22433 abstractC22433 = C12038.f40301;
        f2336 = new C0559(abstractC22433, abstractC22433);
    }

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public static C0559 m2652() {
        return f2336;
    }

    public C0559(AbstractC22433 abstractC22433, AbstractC22433 abstractC22434) {
        this.f2337 = abstractC22433;
        this.f2338 = abstractC22434;
    }

    @Override // l.InterfaceC3196
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final Object mo2653(Integer num) {
        C9028 c9028 = new C9028();
        C21582 c21582 = new C21582(num);
        EnumC4710 enumC4710 = EnumC4710.f16620;
        EnumC11332 enumC11332 = EnumC11332.f38236;
        int iM33722 = C13884.m33722(this.f2337, c9028, c21582, C17308.f55088, enumC4710, enumC11332);
        if (iM33722 != -1 && ((C9548) this.f2337.get(iM33722)).m24405(num)) {
            return this.f2338.get(iM33722);
        }
        return null;
    }

    @Override // l.InterfaceC3196
    /* JADX INFO: renamed from: ۙ */
    public final AbstractC6910 mo2654() {
        AbstractC22433 abstractC22433 = this.f2337;
        if (abstractC22433.isEmpty()) {
            return C13449.f44496;
        }
        int i = C9548.f32245;
        return new C2345(new C7098(abstractC22433, C1785.f6936), this.f2338, null);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public C0559 mo2655(C9548 c9548) {
        if (!c9548.m24404()) {
            AbstractC22433 abstractC22433 = this.f2337;
            if (!abstractC22433.isEmpty()) {
                if (abstractC22433.isEmpty()) {
                    throw new NoSuchElementException();
                }
                if (!c9548.m24406(C9548.m24396(((C9548) abstractC22433.get(0)).f32247, ((C9548) abstractC22433.get(abstractC22433.size() - 1)).f32248))) {
                    C10439 c10439 = new C10439();
                    AbstractC18054 abstractC18054 = c9548.f32247;
                    EnumC4710 enumC4710 = EnumC4710.f16615;
                    EnumC11332 enumC11332 = EnumC11332.f38234;
                    abstractC18054.getClass();
                    C17308 c17308 = C17308.f55088;
                    int iM33722 = C13884.m33722(abstractC22433, c10439, abstractC18054, c17308, enumC4710, enumC11332);
                    C9028 c9028 = new C9028();
                    AbstractC18054 abstractC18055 = c9548.f32248;
                    EnumC4710 enumC4711 = EnumC4710.f16620;
                    abstractC18055.getClass();
                    int iM33723 = C13884.m33722(abstractC22433, c9028, abstractC18055, c17308, enumC4711, enumC11332);
                    if (iM33722 < iM33723) {
                        return new C21021(new C7616(this, iM33723 - iM33722, iM33722, c9548), this.f2338.subList(iM33722, iM33723), c9548, this);
                    }
                }
            }
            return this;
        }
        return f2336;
    }

    public final int hashCode() {
        return mo2654().hashCode();
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof InterfaceC3196)) {
            return false;
        }
        AbstractC6910 abstractC6910Mo2654 = mo2654();
        Map mapMo2654 = ((InterfaceC3196) obj).mo2654();
        abstractC6910Mo2654.getClass();
        return C8136.m21448(abstractC6910Mo2654, mapMo2654);
    }

    public final String toString() {
        AbstractC6910 abstractC6910Mo2654 = mo2654();
        abstractC6910Mo2654.getClass();
        return C8136.m21447(abstractC6910Mo2654);
    }

    public Object writeReplace() {
        return new C20316(mo2654());
    }

    private void readObject(ObjectInputStream objectInputStream) throws InvalidObjectException {
        throw new InvalidObjectException("Use SerializedForm");
    }
}
