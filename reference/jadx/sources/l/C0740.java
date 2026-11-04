package l;

import bin.mt.json.JSONValue;
import java.io.IOException;

/* JADX INFO: renamed from: l.֡᩹ܳ, reason: contains not printable characters */
/* JADX INFO: compiled from: 17N1 */
/* JADX INFO: loaded from: classes3.dex */
public class C0740 extends JSONValue {

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final String f2706;

    @Override // bin.mt.json.JSONValue
    public boolean isNumber() {
        return true;
    }

    public C0740(String str) {
        if (str == null) {
            throw new NullPointerException("string is null");
        }
        this.f2706 = str;
    }

    @Override // bin.mt.json.JSONValue
    public String toString() {
        return this.f2706;
    }

    @Override // bin.mt.json.JSONValue
    public void write(C1486 c1486) throws IOException {
        c1486.m5308(this.f2706);
    }

    @Override // bin.mt.json.JSONValue
    public int asInt() {
        return Integer.parseInt(this.f2706, 10);
    }

    @Override // bin.mt.json.JSONValue
    public long asLong() {
        return Long.parseLong(this.f2706, 10);
    }

    @Override // bin.mt.json.JSONValue
    public float asFloat() {
        return Float.parseFloat(this.f2706);
    }

    @Override // bin.mt.json.JSONValue
    public double asDouble() {
        return Double.parseDouble(this.f2706);
    }

    @Override // bin.mt.json.JSONValue
    public int hashCode() {
        return this.f2706.hashCode();
    }

    @Override // bin.mt.json.JSONValue
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && getClass() == obj.getClass()) {
            return this.f2706.equals(((C0740) obj).f2706);
        }
        return false;
    }
}
