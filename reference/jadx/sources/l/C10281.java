package l;

import android.content.res.Resources;

/* JADX INFO: renamed from: l.ۤ۫, reason: contains not printable characters */
/* JADX INFO: compiled from: Z4TG */
/* JADX INFO: loaded from: classes3.dex */
public final class C10281 {

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final Resources f35024;

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final Resources.Theme f35025;

    public C10281(Resources resources, Resources.Theme theme) {
        this.f35024 = resources;
        this.f35025 = theme;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && C10281.class == obj.getClass()) {
            C10281 c10281 = (C10281) obj;
            if (this.f35024.equals(c10281.f35024) && C13638.equals(this.f35025, c10281.f35025)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return C13638.hash(this.f35024, this.f35025);
    }
}
