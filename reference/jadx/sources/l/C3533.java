package l;

import bin.mt.json.JSONValue;
import java.io.IOException;

/* JADX INFO: renamed from: l.ۗ᩹᩹, reason: contains not printable characters */
/* JADX INFO: compiled from: LAGN */
/* JADX INFO: loaded from: classes2.dex */
public class C3533 extends JSONValue {

    /* JADX INFO: renamed from: ܺ, reason: not valid java name and contains not printable characters */
    public final String f13019;

    @Override // bin.mt.json.JSONValue
    public boolean isString() {
        return true;
    }

    public C3533(String str) {
        if (str == null) {
            throw new NullPointerException("string is null");
        }
        this.f13019 = str;
    }

    @Override // bin.mt.json.JSONValue
    public void write(C4323 c4323) throws IOException {
        c4323.m12155(this.f13019);
    }

    @Override // bin.mt.json.JSONValue
    public String asString() {
        return this.f13019;
    }

    @Override // bin.mt.json.JSONValue
    public int hashCode() {
        return this.f13019.hashCode();
    }

    @Override // bin.mt.json.JSONValue
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && getClass() == obj.getClass()) {
            return this.f13019.equals(((C3533) obj).f13019);
        }
        return false;
    }
}
