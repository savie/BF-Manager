package l;

import bin.mt.json.JSONArray;
import bin.mt.json.JSONValue;
import java.util.Iterator;

/* JADX INFO: renamed from: l.᩶᩹ܳ, reason: contains not printable characters */
/* JADX INFO: compiled from: LAUN */
/* JADX INFO: loaded from: classes.dex */
public class C21623 implements Iterator {

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ JSONArray f69047;

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ Iterator f69048;

    public C21623(JSONArray jSONArray, Iterator it) {
        this.f69047 = jSONArray;
        this.f69048 = it;
    }

    @Override // java.util.Iterator
    public boolean hasNext() {
        return this.f69048.hasNext();
    }

    @Override // java.util.Iterator
    public JSONValue next() {
        return (JSONValue) this.f69048.next();
    }

    @Override // java.util.Iterator
    public void remove() {
        throw new UnsupportedOperationException();
    }
}
