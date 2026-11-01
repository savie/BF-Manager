package l;

import bin.mt.json.JSONObject;
import bin.mt.json.JSONValue;
import java.util.Iterator;

/* JADX INFO: renamed from: l.֫᩹᩹, reason: contains not printable characters */
/* JADX INFO: compiled from: BAUQ */
/* JADX INFO: loaded from: classes2.dex */
public class C2122 implements Iterator {

    /* JADX INFO: renamed from: ֡, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ Iterator f7779;

    /* JADX INFO: renamed from: ܺ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ JSONObject f7780;

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ Iterator f7781;

    public C2122(JSONObject jSONObject, Iterator it, Iterator it2) {
        this.f7780 = jSONObject;
        this.f7781 = it;
        this.f7779 = it2;
    }

    @Override // java.util.Iterator
    public boolean hasNext() {
        return this.f7781.hasNext();
    }

    @Override // java.util.Iterator
    public JSONObject.Member next() {
        return new JSONObject.Member((String) this.f7781.next(), (JSONValue) this.f7779.next());
    }

    @Override // java.util.Iterator
    public void remove() {
        throw new UnsupportedOperationException();
    }
}
