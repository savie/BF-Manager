package l;

import bin.mt.json.JSONArray;
import bin.mt.json.JSONValue;
import java.util.Iterator;

/* JADX INFO: renamed from: l.ۧ᩹᩹, reason: contains not printable characters */
/* JADX INFO: compiled from: LAUN */
/* JADX INFO: loaded from: classes3.dex */
public class C11296 implements Iterator {

    /* JADX INFO: renamed from: ܺ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ JSONArray f38133;

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ Iterator f38134;

    public C11296(JSONArray jSONArray, Iterator it) {
        this.f38133 = jSONArray;
        this.f38134 = it;
    }

    @Override // java.util.Iterator
    public boolean hasNext() {
        return this.f38134.hasNext();
    }

    @Override // java.util.Iterator
    public JSONValue next() {
        return (JSONValue) this.f38134.next();
    }

    @Override // java.util.Iterator
    public void remove() {
        throw new UnsupportedOperationException();
    }
}
