package l;

import bin.mt.json.JSONValue;
import java.io.IOException;

/* JADX INFO: renamed from: l.᩻᩹᩹, reason: contains not printable characters */
/* JADX INFO: compiled from: S7O6 */
/* JADX INFO: loaded from: classes.dex */
public class C23996 extends JSONValue {

    /* JADX INFO: renamed from: ֡, reason: not valid java name and contains not printable characters */
    public final boolean f77766;

    /* JADX INFO: renamed from: ܺ, reason: not valid java name and contains not printable characters */
    public final boolean f77767;

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public final String f77768;

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public final boolean f77769;

    public C23996(String str) {
        this.f77768 = str;
        this.f77769 = "null".equals(str);
        this.f77766 = "true".equals(str);
        this.f77767 = "false".equals(str);
    }

    @Override // bin.mt.json.JSONValue
    public void write(C4323 c4323) throws IOException {
        c4323.m12159(this.f77768);
    }

    @Override // bin.mt.json.JSONValue
    public String toString() {
        return this.f77768;
    }

    @Override // bin.mt.json.JSONValue
    public int hashCode() {
        return this.f77768.hashCode();
    }

    @Override // bin.mt.json.JSONValue
    public boolean isNull() {
        return this.f77769;
    }

    @Override // bin.mt.json.JSONValue
    public boolean isTrue() {
        return this.f77766;
    }

    @Override // bin.mt.json.JSONValue
    public boolean isFalse() {
        return this.f77767;
    }

    @Override // bin.mt.json.JSONValue
    public boolean isBoolean() {
        return this.f77766 || this.f77767;
    }

    @Override // bin.mt.json.JSONValue
    public boolean asBoolean() {
        return this.f77769 ? super.asBoolean() : this.f77766;
    }

    @Override // bin.mt.json.JSONValue
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && getClass() == obj.getClass()) {
            return this.f77768.equals(((C23996) obj).f77768);
        }
        return false;
    }
}
