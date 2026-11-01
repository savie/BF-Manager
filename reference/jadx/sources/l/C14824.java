package l;

import bin.mt.json.JSONValue;
import java.io.IOException;

/* JADX INFO: renamed from: l.ܳ᩹᩹, reason: contains not printable characters */
/* JADX INFO: compiled from: 17N1 */
/* JADX INFO: loaded from: classes4.dex */
public class C14824 extends JSONValue {

    /* JADX INFO: renamed from: ܺ, reason: not valid java name and contains not printable characters */
    public final String f48448;

    @Override // bin.mt.json.JSONValue
    public boolean isNumber() {
        return true;
    }

    public C14824(String str) {
        if (str == null) {
            throw new NullPointerException("string is null");
        }
        this.f48448 = str;
    }

    @Override // bin.mt.json.JSONValue
    public String toString() {
        return this.f48448;
    }

    @Override // bin.mt.json.JSONValue
    public void write(C4323 c4323) throws IOException {
        c4323.m12151(this.f48448);
    }

    @Override // bin.mt.json.JSONValue
    public int asInt() {
        return Integer.parseInt(this.f48448, 10);
    }

    @Override // bin.mt.json.JSONValue
    public long asLong() {
        return Long.parseLong(this.f48448, 10);
    }

    @Override // bin.mt.json.JSONValue
    public float asFloat() {
        return Float.parseFloat(this.f48448);
    }

    @Override // bin.mt.json.JSONValue
    public double asDouble() {
        return Double.parseDouble(this.f48448);
    }

    @Override // bin.mt.json.JSONValue
    public int hashCode() {
        return this.f48448.hashCode();
    }

    @Override // bin.mt.json.JSONValue
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && getClass() == obj.getClass()) {
            return this.f48448.equals(((C14824) obj).f48448);
        }
        return false;
    }
}
