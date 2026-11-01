package l;

/* JADX INFO: renamed from: l.ۡܿ᩸, reason: contains not printable characters */
/* JADX INFO: compiled from: 49FQ */
/* JADX INFO: loaded from: classes3.dex */
public abstract class AbstractC9032 {

    /* JADX INFO: renamed from: ܺ, reason: not valid java name and contains not printable characters */
    public AbstractC14676 f30834;

    public abstract Object getValue();

    public AbstractC9032(AbstractC14676 abstractC14676) {
        this.f30834 = abstractC14676;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        AbstractC9032 abstractC9032 = (AbstractC9032) obj;
        if (this.f30834 != abstractC9032.f30834) {
            return false;
        }
        if (getValue() != null) {
            return getValue().equals(abstractC9032.getValue());
        }
        return abstractC9032.getValue() == null;
    }

    public final int hashCode() {
        return this.f30834.m35212();
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append("[");
        return C22697.m50267(sb, mo23363(), "]");
    }

    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    public String mo23363() {
        if (getValue() != null) {
            return getValue().toString();
        }
        return null;
    }

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final AbstractC14676 m23364() {
        return this.f30834;
    }
}
