package l;

import bin.mt.json.JSONArray;
import java.io.IOException;
import java.io.InputStream;
import java.net.SocketTimeoutException;
import java.nio.charset.CharacterCodingException;
import java.util.LinkedHashMap;

/* JADX INFO: renamed from: l.۫᩶ۚ, reason: contains not printable characters */
/* JADX INFO: compiled from: 46W4 */
/* JADX INFO: loaded from: classes4.dex */
public final class C13346 implements InterfaceC22297 {

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C25281 f42555;

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ JSONArray f42556;

    /* JADX INFO: renamed from: ܳ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ LinkedHashMap f42557;

    /* JADX INFO: renamed from: ᩴ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C2160 f42558;

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C18415 f42559;

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C18415 f42560;

    public C13346(C25281 c25281, C18415 c18415, C2160 c2160, LinkedHashMap linkedHashMap, JSONArray jSONArray, C18415 c18416) {
        this.f42555 = c25281;
        this.f42560 = c18415;
        this.f42558 = c2160;
        this.f42557 = linkedHashMap;
        this.f42556 = jSONArray;
        this.f42559 = c18416;
    }

    /* JADX WARN: Code duplicated, block: B:19:0x0050  */
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final boolean m32926(C1907 c1907) {
        EnumC13093 enumC13093M6567 = c1907.m6567();
        EnumC13093 enumC13093 = EnumC13093.REGULAR;
        if (enumC13093M6567 == enumC13093) {
            JSONArray jSONArray = this.f42556;
            LinkedHashMap linkedHashMap = this.f42557;
            C2160 c2160 = this.f42558;
            C18415 c18415 = this.f42560;
            if (c18415 != null) {
                C4245 c4245M36883 = C15407.m36883(c18415, c1907.m6565().getName());
                boolean zMatches = c2160.f7126 ? c4245M36883.matches() : c4245M36883.find();
                C25281.m56458();
                if (!zMatches) {
                    if (c4245M36883.m13557() || c4245M36883.m13560()) {
                        C25281.m56460(linkedHashMap, "name_match_failed");
                        C25281.m56459(jSONArray, c1907, "name_match_failed");
                        return false;
                    }
                } else {
                    long jM6566 = c1907.m6566();
                    long jM6568 = c1907.m6568();
                    if (((c2160.f7119 == -1 || c2160.f7123 != -1) && jM6566 < 0) || (!(c2160.f7122 == null && c2160.f7124 == null) && jM6568 <= 0)) {
                        C25281.m56460(linkedHashMap, "metadata_unavailable");
                        C25281.m56459(jSONArray, c1907, "metadata_unavailable");
                        return false;
                    }
                    if ((c2160.f7119 == -1 || jM6566 >= c2160.f7119) && ((c2160.f7123 == -1 || jM6566 < c2160.f7123) && ((c2160.f7122 == null || jM6568 >= c2160.f7122.longValue()) && (c2160.f7124 == null || jM6568 < c2160.f7124.longValue())))) {
                        C18415 c18416 = this.f42559;
                        if (c18416 == null) {
                            return true;
                        }
                        try {
                            C1907 c1907M50234 = this.f42555.f81667.m50234(c1907.m6565().mo4294());
                            if (c1907M50234.m6567() != enumC13093) {
                                C25281.m56460(linkedHashMap, "file_unreadable");
                                C25281.m56459(jSONArray, c1907, "file_unreadable");
                                return false;
                            }
                            try {
                                InputStream inputStreamMo4290 = c1907M50234.m6565().mo4290();
                                try {
                                    boolean zM56461 = C25281.m56461(inputStreamMo4290, c18416);
                                    if (inputStreamMo4290 != null) {
                                        inputStreamMo4290.close();
                                    }
                                    return zM56461;
                                } catch (Throwable th) {
                                    if (inputStreamMo4290 == null) {
                                        throw th;
                                    }
                                    try {
                                        inputStreamMo4290.close();
                                        throw th;
                                    } catch (Throwable th2) {
                                        th.addSuppressed(th2);
                                        throw th;
                                    }
                                }
                            } catch (IOException | IllegalArgumentException | SecurityException e) {
                                C25281.m56458();
                                String str = "content_search_failed";
                                C25281.m56460(linkedHashMap, "content_search_failed");
                                if (e instanceof CharacterCodingException) {
                                    str = "invalid_encoding";
                                } else if (e instanceof SocketTimeoutException) {
                                    str = "read_timeout";
                                }
                                C25281.m56459(jSONArray, c1907, str);
                                return false;
                            }
                        } catch (C10186 unused) {
                            C25281.m56460(linkedHashMap, "file_unreadable");
                            C25281.m56459(jSONArray, c1907, "file_unreadable");
                            return false;
                        }
                    }
                }
            } else {
                long jM6567 = c1907.m6566();
                long jM6569 = c1907.m6568();
                if (c2160.f7119 == -1) {
                }
                C25281.m56460(linkedHashMap, "metadata_unavailable");
                C25281.m56459(jSONArray, c1907, "metadata_unavailable");
                return false;
            }
        }
        return false;
    }
}
