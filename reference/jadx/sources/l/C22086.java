package l;

import java.util.Map;

/* JADX INFO: renamed from: l.᩹ۚ᩸, reason: contains not printable characters */
/* JADX INFO: compiled from: 1AZL */
/* JADX INFO: loaded from: classes.dex */
public final class C22086 implements Map.Entry {

    /* JADX INFO: renamed from: ֡, reason: not valid java name and contains not printable characters */
    public final Object f71541;

    /* JADX INFO: renamed from: ۛ, reason: not valid java name and contains not printable characters */
    public C22086 f71542;

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public C22086 f71543;

    /* JADX INFO: renamed from: ۫, reason: not valid java name and contains not printable characters */
    public C22086 f71544;

    /* JADX INFO: renamed from: ܺ, reason: not valid java name and contains not printable characters */
    public final boolean f71545;

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public C22086 f71546;

    /* JADX INFO: renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public C22086 f71547;

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public int f71548;

    /* JADX INFO: renamed from: ᩻, reason: not valid java name and contains not printable characters */
    public Object f71549;

    public C22086(boolean z) {
        this.f71541 = null;
        this.f71545 = z;
        this.f71542 = this;
        this.f71544 = this;
    }

    public C22086(boolean z, C22086 c22086, Object obj, C22086 c22087, C22086 c22088) {
        this.f71547 = c22086;
        this.f71541 = obj;
        this.f71545 = z;
        this.f71548 = 1;
        this.f71544 = c22087;
        this.f71542 = c22088;
        c22088.f71544 = this;
        c22087.f71542 = this;
    }

    @Override // java.util.Map.Entry
    public final Object getKey() {
        return this.f71541;
    }

    @Override // java.util.Map.Entry
    public final Object getValue() {
        return this.f71549;
    }

    @Override // java.util.Map.Entry
    public final Object setValue(Object obj) {
        if (obj == null && !this.f71545) {
            throw new NullPointerException("value == null");
        }
        Object obj2 = this.f71549;
        this.f71549 = obj;
        return obj2;
    }

    @Override // java.util.Map.Entry
    public final boolean equals(Object obj) {
        if (obj instanceof Map.Entry) {
            Map.Entry entry = (Map.Entry) obj;
            Object obj2 = this.f71541;
            if (obj2 != null ? obj2.equals(entry.getKey()) : entry.getKey() == null) {
                Object obj3 = this.f71549;
                if (obj3 == null) {
                    if (entry.getValue() == null) {
                        return true;
                    }
                } else if (obj3.equals(entry.getValue())) {
                    return true;
                }
            }
        }
        return false;
    }

    @Override // java.util.Map.Entry
    public final int hashCode() {
        Object obj = this.f71541;
        int iHashCode = obj == null ? 0 : obj.hashCode();
        Object obj2 = this.f71549;
        return (obj2 != null ? obj2.hashCode() : 0) ^ iHashCode;
    }

    public final String toString() {
        return this.f71541 + "=" + this.f71549;
    }
}
