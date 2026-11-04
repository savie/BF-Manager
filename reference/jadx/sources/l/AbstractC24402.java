package l;

import java.util.LinkedHashMap;

/* JADX INFO: renamed from: l.᩺ܺۙ, reason: contains not printable characters */
/* JADX INFO: compiled from: MANG */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC24402 {

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final LinkedHashMap f79170 = new LinkedHashMap();

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final LinkedHashMap m54576() {
        return this.f79170;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof AbstractC24402) {
            return C15243.m36589(this.f79170, ((AbstractC24402) obj).f79170);
        }
        return false;
    }

    public final int hashCode() {
        return this.f79170.hashCode();
    }

    public final String toString() {
        return "CreationExtras(extras=" + this.f79170 + ')';
    }
}
