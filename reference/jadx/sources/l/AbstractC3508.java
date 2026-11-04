package l;

import java.util.EventObject;

/* JADX INFO: renamed from: l.ۗܶ᩵, reason: contains not printable characters */
/* JADX INFO: compiled from: 1A27 */
/* JADX INFO: loaded from: classes2.dex */
public abstract class AbstractC3508 extends EventObject implements Cloneable {
    public static final long serialVersionUID = -8558445644541006271L;

    public abstract String getName();

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public abstract AbstractC16932 mo11500();

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public abstract String mo11501();

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public abstract AbstractC12457 mo11502();

    @Override // 
    public AbstractC3508 clone() {
        try {
            return (AbstractC3508) super.clone();
        } catch (CloneNotSupportedException unused) {
            return null;
        }
    }
}
