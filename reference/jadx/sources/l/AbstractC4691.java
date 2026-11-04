package l;

/* JADX INFO: renamed from: l.ۙۚܶ, reason: contains not printable characters */
/* JADX INFO: compiled from: 49FQ */
/* JADX INFO: loaded from: classes2.dex */
public abstract class AbstractC4691 {

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public AbstractC15877 f16567;

    public abstract Object getValue();

    public AbstractC4691(AbstractC15877 abstractC15877) {
        this.f16567 = abstractC15877;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        AbstractC4691 abstractC4691 = (AbstractC4691) obj;
        if (this.f16567 != abstractC4691.f16567) {
            return false;
        }
        if (getValue() != null) {
            return getValue().equals(abstractC4691.getValue());
        }
        return abstractC4691.getValue() == null;
    }

    public final int hashCode() {
        return this.f16567.m37846();
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append("[");
        return C8947.m23910(sb, mo5610(), "]");
    }

    /* JADX INFO: renamed from: ۤ */
    public String mo5610() {
        if (getValue() != null) {
            return getValue().toString();
        }
        return null;
    }

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final AbstractC15877 m14567() {
        return this.f16567;
    }
}
