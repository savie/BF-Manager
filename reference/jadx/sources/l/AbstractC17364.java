package l;

import java.util.EventObject;

/* JADX INFO: renamed from: l.ܿ۬۠, reason: contains not printable characters */
/* JADX INFO: compiled from: 1A27 */
/* JADX INFO: loaded from: classes4.dex */
public abstract class AbstractC17364 extends EventObject implements Cloneable {
    public static final long serialVersionUID = -8558445644541006271L;

    public abstract String getName();

    /* JADX INFO: renamed from: ۖ, reason: not valid java name and contains not printable characters */
    public abstract String mo40397();

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public abstract AbstractC20187 mo40398();

    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    public abstract AbstractC11015 mo40399();

    @Override // 
    public AbstractC17364 clone() {
        try {
            return (AbstractC17364) super.clone();
        } catch (CloneNotSupportedException unused) {
            return null;
        }
    }
}
