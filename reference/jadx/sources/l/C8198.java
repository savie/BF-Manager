package l;

import bin.mt.json.JSONObject;
import bin.mt.json.JSONValue;
import java.util.Iterator;

/* JADX INFO: renamed from: l.۟᩹ܳ, reason: contains not printable characters */
/* JADX INFO: compiled from: BAUQ */
/* JADX INFO: loaded from: classes3.dex */
public class C8198 implements Iterator {

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ JSONObject f27016;

    /* JADX INFO: renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ Iterator f27017;

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ Iterator f27018;

    public C8198(JSONObject jSONObject, Iterator it, Iterator it2) {
        this.f27016 = jSONObject;
        this.f27018 = it;
        this.f27017 = it2;
    }

    @Override // java.util.Iterator
    public boolean hasNext() {
        return this.f27018.hasNext();
    }

    @Override // java.util.Iterator
    public JSONObject.Member next() {
        return new JSONObject.Member((String) this.f27018.next(), (JSONValue) this.f27017.next());
    }

    @Override // java.util.Iterator
    public void remove() {
        throw new UnsupportedOperationException();
    }
}
