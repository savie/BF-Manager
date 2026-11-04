package l;

import bin.mt.json.JSONValue;
import java.io.IOException;

/* JADX INFO: renamed from: l.ۢ᩹ܳ, reason: contains not printable characters */
/* JADX INFO: compiled from: LAGN */
/* JADX INFO: loaded from: classes4.dex */
public class C10434 extends JSONValue {

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final String f33162;

    @Override // bin.mt.json.JSONValue
    public boolean isString() {
        return true;
    }

    public C10434(String str) {
        if (str == null) {
            throw new NullPointerException("string is null");
        }
        this.f33162 = str;
    }

    @Override // bin.mt.json.JSONValue
    public void write(C1486 c1486) throws IOException {
        c1486.m5304(this.f33162);
    }

    @Override // bin.mt.json.JSONValue
    public String asString() {
        return this.f33162;
    }

    @Override // bin.mt.json.JSONValue
    public int hashCode() {
        return this.f33162.hashCode();
    }

    @Override // bin.mt.json.JSONValue
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && getClass() == obj.getClass()) {
            return this.f33162.equals(((C10434) obj).f33162);
        }
        return false;
    }
}
