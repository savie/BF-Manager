package l;

/* JADX INFO: renamed from: l.ᩴۡ᩵, reason: contains not printable characters */
/* JADX INFO: compiled from: 7BTO */
/* JADX INFO: loaded from: classes5.dex */
public class C19719 extends AbstractC2326 implements InterfaceC22703, InterfaceC13751 {

    /* JADX INFO: renamed from: ֨, reason: not valid java name and contains not printable characters */
    public final int f63467;

    public C19719(int i, Class cls, String str, String str2, int i2) {
        this(i, AbstractC2326.f7502, cls, str, str2, i2);
    }

    public C19719(int i, Object obj, Class cls, String str, String str2, int i2) {
        super(obj, cls, str, str2, (i2 & 1) == 1);
        this.f63467 = i;
    }

    @Override // l.InterfaceC22703
    /* JADX INFO: renamed from: ۤ */
    public final int mo2104() {
        return this.f63467;
    }

    @Override // l.AbstractC2326
    /* JADX INFO: renamed from: ᩸ */
    public final InterfaceC8531 mo6298() {
        C16735.m39516(this);
        return this;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof C19719) {
            C19719 c19719 = (C19719) obj;
            return m7833().equals(c19719.m7833()) && m7831().equals(c19719.m7831()) && C15243.m36589(this.f7503, c19719.f7503) && C15243.m36589(m7832(), c19719.m7832());
        }
        if (obj instanceof InterfaceC13751) {
            return obj.equals(mo6297());
        }
        return false;
    }

    public final int hashCode() {
        return m7831().hashCode() + ((m7833().hashCode() + (m7832() == null ? 0 : m7832().hashCode() * 31)) * 31);
    }

    public final String toString() {
        InterfaceC8531 interfaceC8531Mo6297 = mo6297();
        if (interfaceC8531Mo6297 != this) {
            return interfaceC8531Mo6297.toString();
        }
        if ("<init>".equals(m7833())) {
            return "constructor (Kotlin reflection is not available)";
        }
        return "function " + m7833() + " (Kotlin reflection is not available)";
    }
}
