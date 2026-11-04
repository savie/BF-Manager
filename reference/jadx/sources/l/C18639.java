package l;

import bin.mt.json.JSONValue;
import java.io.IOException;

/* JADX INFO: renamed from: l.ܿ᩹ܳ, reason: contains not printable characters */
/* JADX INFO: compiled from: S7O6 */
/* JADX INFO: loaded from: classes5.dex */
public class C18639 extends JSONValue {

    /* JADX INFO: renamed from: ֡, reason: not valid java name and contains not printable characters */
    public final String f60604;

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final boolean f60605;

    /* JADX INFO: renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public final boolean f60606;

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public final boolean f60607;

    public C18639(String str) {
        this.f60604 = str;
        this.f60607 = "null".equals(str);
        this.f60606 = "true".equals(str);
        this.f60605 = "false".equals(str);
    }

    @Override // bin.mt.json.JSONValue
    public void write(C1486 c1486) throws IOException {
        c1486.m5306(this.f60604);
    }

    @Override // bin.mt.json.JSONValue
    public String toString() {
        return this.f60604;
    }

    @Override // bin.mt.json.JSONValue
    public int hashCode() {
        return this.f60604.hashCode();
    }

    @Override // bin.mt.json.JSONValue
    public boolean isNull() {
        return this.f60607;
    }

    @Override // bin.mt.json.JSONValue
    public boolean isTrue() {
        return this.f60606;
    }

    @Override // bin.mt.json.JSONValue
    public boolean isFalse() {
        return this.f60605;
    }

    @Override // bin.mt.json.JSONValue
    public boolean isBoolean() {
        return this.f60606 || this.f60605;
    }

    @Override // bin.mt.json.JSONValue
    public boolean asBoolean() {
        return this.f60607 ? super.asBoolean() : this.f60606;
    }

    @Override // bin.mt.json.JSONValue
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && getClass() == obj.getClass()) {
            return this.f60604.equals(((C18639) obj).f60604);
        }
        return false;
    }
}
