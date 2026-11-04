package l;

import java.io.InvalidObjectException;
import java.io.ObjectInputStream;
import java.io.Serializable;
import java.util.Map;
import java.util.NoSuchElementException;

/* JADX INFO: renamed from: l.۟۫ܽ, reason: contains not printable characters */
/* JADX INFO: compiled from: V5XH */
/* JADX INFO: loaded from: classes4.dex */
public class C7894 implements InterfaceC8312, Serializable {
    public static final long serialVersionUID = 0;

    /* JADX INFO: renamed from: ֡, reason: not valid java name and contains not printable characters */
    public static final C7894 f26240;

    /* JADX INFO: renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public static final /* synthetic */ int f26241 = 0;

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final transient AbstractC1928 f26242;

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public final transient AbstractC1928 f26243;

    static {
        int i = AbstractC1928.f6477;
        AbstractC1928 abstractC1928 = C4867.f16966;
        f26240 = new C7894(abstractC1928, abstractC1928);
    }

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public static C7894 m21435() {
        return f26240;
    }

    public C7894(AbstractC1928 abstractC1928, AbstractC1928 abstractC1929) {
        this.f26242 = abstractC1928;
        this.f26243 = abstractC1929;
    }

    @Override // l.InterfaceC8312
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final Object mo21436(Integer num) {
        C24303 c24303 = new C24303();
        C3484 c3484 = new C3484(num);
        EnumC8595 enumC8595 = EnumC8595.f28097;
        EnumC7850 enumC7850 = EnumC7850.f26143;
        int iM19448 = C7104.m19448(this.f26242, c24303, c3484, C0108.f1051, enumC8595, enumC7850);
        if (iM19448 != -1 && ((C2346) this.f26242.get(iM19448)).m7918(num)) {
            return this.f26243.get(iM19448);
        }
        return null;
    }

    @Override // l.InterfaceC8312
    /* JADX INFO: renamed from: ۙ */
    public final AbstractC17589 mo21437() {
        AbstractC1928 abstractC1928 = this.f26242;
        if (abstractC1928.isEmpty()) {
            return C15307.f50041;
        }
        int i = C2346.f7567;
        return new C19609(new C5613(abstractC1928, C9057.f29455), this.f26243, null);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public C7894 mo21438(C2346 c2346) {
        if (!c2346.m7917()) {
            AbstractC1928 abstractC1928 = this.f26242;
            if (!abstractC1928.isEmpty()) {
                if (abstractC1928.isEmpty()) {
                    throw new NoSuchElementException();
                }
                if (!c2346.m7919(C2346.m7909(((C2346) abstractC1928.get(0)).f7568, ((C2346) abstractC1928.get(abstractC1928.size() - 1)).f7569))) {
                    C4165 c4165 = new C4165();
                    AbstractC20638 abstractC20638 = c2346.f7568;
                    EnumC8595 enumC8595 = EnumC8595.f28095;
                    EnumC7850 enumC7850 = EnumC7850.f26145;
                    abstractC20638.getClass();
                    C0108 c0108 = C0108.f1051;
                    int iM19448 = C7104.m19448(abstractC1928, c4165, abstractC20638, c0108, enumC8595, enumC7850);
                    C24303 c24303 = new C24303();
                    AbstractC20638 abstractC20639 = c2346.f7569;
                    EnumC8595 enumC8596 = EnumC8595.f28097;
                    abstractC20639.getClass();
                    int iM19449 = C7104.m19448(abstractC1928, c24303, abstractC20639, c0108, enumC8596, enumC7850);
                    if (iM19448 < iM19449) {
                        return new C21319(new C14605(this, iM19449 - iM19448, iM19448, c2346), this.f26243.subList(iM19448, iM19449), c2346, this);
                    }
                }
            }
            return this;
        }
        return f26240;
    }

    public final int hashCode() {
        return mo21437().hashCode();
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof InterfaceC8312)) {
            return false;
        }
        AbstractC17589 abstractC17589Mo21437 = mo21437();
        Map mapMo21437 = ((InterfaceC8312) obj).mo21437();
        abstractC17589Mo21437.getClass();
        return C15769.m37710(abstractC17589Mo21437, mapMo21437);
    }

    public final String toString() {
        AbstractC17589 abstractC17589Mo21437 = mo21437();
        abstractC17589Mo21437.getClass();
        return C15769.m37709(abstractC17589Mo21437);
    }

    public Object writeReplace() {
        return new C0436(mo21437());
    }

    private void readObject(ObjectInputStream objectInputStream) throws InvalidObjectException {
        throw new InvalidObjectException("Use SerializedForm");
    }
}
