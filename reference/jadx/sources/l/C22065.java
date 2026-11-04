package l;

import java.io.Serializable;
import java.util.EnumSet;

/* JADX INFO: renamed from: l.᩷۫ܽ, reason: contains not printable characters */
/* JADX INFO: compiled from: A5TB */
/* JADX INFO: loaded from: classes.dex */
public final class C22065 implements Serializable {
    public static final long serialVersionUID = 0;

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final EnumSet f71142;

    public C22065(EnumSet enumSet) {
        this.f71142 = enumSet;
    }

    public Object readResolve() {
        return new C10876(this.f71142.clone(), 0);
    }
}
