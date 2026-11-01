package l;

import bin.mt.json.JSONArray;
import java.io.IOException;
import java.io.InputStream;
import java.net.SocketTimeoutException;
import java.nio.charset.CharacterCodingException;
import java.util.LinkedHashMap;

/* JADX INFO: renamed from: l.ۘܶ۬, reason: contains not printable characters */
/* JADX INFO: compiled from: 46W4 */
/* JADX INFO: loaded from: classes3.dex */
public final class C4023 implements InterfaceC5435 {

    /* JADX INFO: renamed from: ۖ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C14690 f14876;

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C21663 f14877;

    /* JADX INFO: renamed from: ۚ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C23075 f14878;

    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ JSONArray f14879;

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C14690 f14880;

    /* JADX INFO: renamed from: ᩹, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ LinkedHashMap f14881;

    public C4023(C21663 c21663, C14690 c14690, C23075 c23075, LinkedHashMap linkedHashMap, JSONArray jSONArray, C14690 c14691) {
        this.f14877 = c21663;
        this.f14876 = c14690;
        this.f14878 = c23075;
        this.f14881 = linkedHashMap;
        this.f14879 = jSONArray;
        this.f14880 = c14691;
    }

    /* JADX WARN: Code duplicated, block: B:19:0x0050  */
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final boolean m11529(C5928 c5928) {
        EnumC12279 enumC12279M16196 = c5928.m16196();
        EnumC12279 enumC12279 = EnumC12279.REGULAR;
        if (enumC12279M16196 == enumC12279) {
            JSONArray jSONArray = this.f14879;
            LinkedHashMap linkedHashMap = this.f14881;
            C23075 c23075 = this.f14878;
            C14690 c14690 = this.f14876;
            if (c14690 != null) {
                C6222 c6222Matcher = c14690.matcher((CharSequence) c5928.m16195().getName());
                boolean zMatches = c23075.f74961 ? c6222Matcher.matches() : c6222Matcher.find();
                C21663.m48393();
                if (!zMatches) {
                    if (c6222Matcher.m17270() || c6222Matcher.m17258()) {
                        C21663.m48395(linkedHashMap, "name_match_failed");
                        C21663.m48394(jSONArray, c5928, "name_match_failed");
                        return false;
                    }
                } else {
                    long jM16197 = c5928.m16197();
                    long jM16198 = c5928.m16198();
                    if (((c23075.f74967 == -1 || c23075.f74969 != -1) && jM16197 < 0) || (!(c23075.f74960 == null && c23075.f74964 == null) && jM16198 <= 0)) {
                        C21663.m48395(linkedHashMap, "metadata_unavailable");
                        C21663.m48394(jSONArray, c5928, "metadata_unavailable");
                        return false;
                    }
                    if ((c23075.f74967 == -1 || jM16197 >= c23075.f74967) && ((c23075.f74969 == -1 || jM16197 < c23075.f74969) && ((c23075.f74960 == null || jM16198 >= c23075.f74960.longValue()) && (c23075.f74964 == null || jM16198 < c23075.f74964.longValue())))) {
                        C14690 c14691 = this.f14880;
                        if (c14691 == null) {
                            return true;
                        }
                        try {
                            C5928 c5928M8503 = this.f14877.f70255.m8503(c5928.m16195().mo33986());
                            if (c5928M8503.m16196() != enumC12279) {
                                C21663.m48395(linkedHashMap, "file_unreadable");
                                C21663.m48394(jSONArray, c5928, "file_unreadable");
                                return false;
                            }
                            try {
                                InputStream inputStreamMo33970 = c5928M8503.m16195().mo33970();
                                try {
                                    boolean zM48396 = C21663.m48396(inputStreamMo33970, c14691);
                                    if (inputStreamMo33970 != null) {
                                        inputStreamMo33970.close();
                                    }
                                    return zM48396;
                                } catch (Throwable th) {
                                    if (inputStreamMo33970 == null) {
                                        throw th;
                                    }
                                    try {
                                        inputStreamMo33970.close();
                                        throw th;
                                    } catch (Throwable th2) {
                                        th.addSuppressed(th2);
                                        throw th;
                                    }
                                }
                            } catch (IOException | IllegalArgumentException | SecurityException e) {
                                C21663.m48393();
                                String str = "content_search_failed";
                                C21663.m48395(linkedHashMap, "content_search_failed");
                                if (e instanceof CharacterCodingException) {
                                    str = "invalid_encoding";
                                } else if (e instanceof SocketTimeoutException) {
                                    str = "read_timeout";
                                }
                                C21663.m48394(jSONArray, c5928, str);
                                return false;
                            }
                        } catch (C12731 unused) {
                            C21663.m48395(linkedHashMap, "file_unreadable");
                            C21663.m48394(jSONArray, c5928, "file_unreadable");
                            return false;
                        }
                    }
                }
            } else {
                long jM16199 = c5928.m16197();
                long jM161910 = c5928.m16198();
                if (c23075.f74967 == -1) {
                }
                C21663.m48395(linkedHashMap, "metadata_unavailable");
                C21663.m48394(jSONArray, c5928, "metadata_unavailable");
                return false;
            }
        }
        return false;
    }
}
