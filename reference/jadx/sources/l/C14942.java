package l;

import bin.mt.json.JSON;
import bin.mt.json.JSONObject;

/* JADX INFO: renamed from: l.ܶۖ۬, reason: contains not printable characters */
/* JADX INFO: compiled from: K77A */
/* JADX INFO: loaded from: classes4.dex */
public final class C14942 {

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final boolean f48724;

    public C14942(boolean z) {
        this.f48724 = z;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final JSONObject m35686() {
        JSONObject jSONObjectObject = JSON.object();
        boolean z = this.f48724;
        return jSONObjectObject.add("confused", z).add("appReferenceOutput", z ? "hex8_upper_no_0x" : "names_or_hex").add("appNameReferencesAccepted", !z).add("systemNameReferencesAccepted", true).add("hexPrefixAccepted", true);
    }
}
