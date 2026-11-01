package l;

import android.net.Uri;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;

/* JADX INFO: renamed from: l.ۡ֫ۙ, reason: contains not printable characters */
/* JADX INFO: compiled from: U7MS */
/* JADX INFO: loaded from: classes3.dex */
public final class C8564 {

    /* JADX INFO: renamed from: ۖ, reason: not valid java name and contains not printable characters */
    public Boolean f29595;

    /* JADX INFO: renamed from: ۘ, reason: not valid java name and contains not printable characters */
    public final String f29596;

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public Uri f29597;

    /* JADX INFO: renamed from: ۠, reason: not valid java name and contains not printable characters */
    public String f29600;

    /* JADX INFO: renamed from: ۬, reason: not valid java name and contains not printable characters */
    public boolean f29602;

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public Uri f29603;

    /* JADX INFO: renamed from: ᩵, reason: not valid java name and contains not printable characters */
    public String f29607;

    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    public final HashMap f29601 = new HashMap();

    /* JADX INFO: renamed from: ᩴ, reason: not valid java name and contains not printable characters */
    public long f29606 = -9223372036854775807L;

    /* JADX INFO: renamed from: ֨, reason: not valid java name and contains not printable characters */
    public long f29594 = -9223372036854775807L;

    /* JADX INFO: renamed from: ᩹, reason: not valid java name and contains not printable characters */
    public long f29609 = -9223372036854775807L;

    /* JADX INFO: renamed from: ۜ, reason: not valid java name and contains not printable characters */
    public long f29599 = -9223372036854775807L;

    /* JADX INFO: renamed from: ۚ, reason: not valid java name and contains not printable characters */
    public ArrayList f29598 = new ArrayList();

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public long f29608 = -9223372036854775807L;

    /* JADX INFO: renamed from: ᩺, reason: not valid java name and contains not printable characters */
    public long f29610 = -9223372036854775807L;

    /* JADX INFO: renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public ArrayList f29605 = new ArrayList();

    /* JADX INFO: renamed from: ܶ, reason: not valid java name and contains not printable characters */
    public ArrayList f29604 = new ArrayList();

    public C8564(String str) {
        this.f29596 = str;
    }

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final void m22335(Uri uri) {
        if (uri == null) {
            return;
        }
        Uri uri2 = this.f29603;
        if (uri2 != null) {
            C2023.m6506("Can't change assetUri from " + this.f29603 + " to " + uri, uri2.equals(uri));
        }
        this.f29603 = uri;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m22326(Uri uri) {
        if (uri == null) {
            return;
        }
        Uri uri2 = this.f29597;
        if (uri2 != null) {
            C2023.m6506("Can't change assetListUri from " + this.f29597 + " to " + uri, uri2.equals(uri));
        }
        this.f29597 = uri;
    }

    /* JADX INFO: renamed from: ᩹, reason: not valid java name and contains not printable characters */
    public final void m22338(long j) {
        if (j == -9223372036854775807L) {
            return;
        }
        long j2 = this.f29606;
        if (j2 != -9223372036854775807L) {
            C2023.m6506("Can't change startDateUnixUs from " + this.f29606 + " to " + j, j2 == j);
        }
        this.f29606 = j;
    }

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final void m22334(long j) {
        if (j == -9223372036854775807L) {
            return;
        }
        long j2 = this.f29594;
        if (j2 != -9223372036854775807L) {
            C2023.m6506("Can't change endDateUnixUs from " + this.f29594 + " to " + j, j2 == j);
        }
        this.f29594 = j;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m22325(long j) {
        if (j == -9223372036854775807L) {
            return;
        }
        long j2 = this.f29609;
        if (j2 != -9223372036854775807L) {
            C2023.m6506("Can't change durationUs from " + this.f29609 + " to " + j, j2 == j);
        }
        this.f29609 = j;
    }

    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    public final void m22332(long j) {
        if (j == -9223372036854775807L) {
            return;
        }
        long j2 = this.f29599;
        if (j2 != -9223372036854775807L) {
            C2023.m6506("Can't change plannedDurationUs from " + this.f29599 + " to " + j, j2 == j);
        }
        this.f29599 = j;
    }

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final void m22337(ArrayList arrayList) {
        if (arrayList.isEmpty()) {
            return;
        }
        if (!this.f29598.isEmpty()) {
            boolean zEquals = this.f29598.equals(arrayList);
            StringBuilder sb = new StringBuilder("Can't change cue from ");
            ArrayList arrayList2 = this.f29598;
            StringBuilder sb2 = new StringBuilder();
            Iterator it = arrayList2.iterator();
            if (it.hasNext()) {
                while (true) {
                    sb2.append((CharSequence) it.next());
                    if (!it.hasNext()) {
                        break;
                    } else {
                        sb2.append((CharSequence) ", ");
                    }
                }
            }
            sb.append(sb2.toString());
            sb.append(" to ");
            StringBuilder sb3 = new StringBuilder();
            Iterator it2 = arrayList.iterator();
            if (it2.hasNext()) {
                while (true) {
                    sb3.append((CharSequence) it2.next());
                    if (!it2.hasNext()) {
                        break;
                    } else {
                        sb3.append((CharSequence) ", ");
                    }
                }
            }
            sb.append(sb3.toString());
            C2023.m6506(sb.toString(), zEquals);
        }
        this.f29598 = arrayList;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m22330(boolean z) {
        if (z) {
            this.f29602 = true;
        }
    }

    /* JADX INFO: renamed from: ۚ, reason: not valid java name and contains not printable characters */
    public final void m22331(long j) {
        if (j == -9223372036854775807L) {
            return;
        }
        long j2 = this.f29608;
        if (j2 != -9223372036854775807L) {
            C2023.m6506("Can't change resumeOffsetUs from " + this.f29608 + " to " + j, j2 == j);
        }
        this.f29608 = j;
    }

    /* JADX INFO: renamed from: ۖ, reason: not valid java name and contains not printable characters */
    public final void m22322(long j) {
        if (j == -9223372036854775807L) {
            return;
        }
        long j2 = this.f29610;
        if (j2 != -9223372036854775807L) {
            C2023.m6506("Can't change playoutLimitUs from " + this.f29610 + " to " + j, j2 == j);
        }
        this.f29610 = j;
    }

    /* JADX INFO: renamed from: ۖ, reason: not valid java name and contains not printable characters */
    public final void m22323(ArrayList arrayList) {
        if (arrayList.isEmpty()) {
            return;
        }
        if (!this.f29605.isEmpty()) {
            boolean zEquals = this.f29605.equals(arrayList);
            StringBuilder sb = new StringBuilder("Can't change snapTypes from ");
            ArrayList arrayList2 = this.f29605;
            StringBuilder sb2 = new StringBuilder();
            Iterator it = arrayList2.iterator();
            if (it.hasNext()) {
                while (true) {
                    sb2.append((CharSequence) it.next());
                    if (!it.hasNext()) {
                        break;
                    } else {
                        sb2.append((CharSequence) ", ");
                    }
                }
            }
            sb.append(sb2.toString());
            sb.append(" to ");
            StringBuilder sb3 = new StringBuilder();
            Iterator it2 = arrayList.iterator();
            if (it2.hasNext()) {
                while (true) {
                    sb3.append((CharSequence) it2.next());
                    if (!it2.hasNext()) {
                        break;
                    } else {
                        sb3.append((CharSequence) ", ");
                    }
                }
            }
            sb.append(sb3.toString());
            C2023.m6506(sb.toString(), zEquals);
        }
        this.f29605 = arrayList;
    }

    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    public final void m22333(ArrayList arrayList) {
        if (arrayList.isEmpty()) {
            return;
        }
        if (!this.f29604.isEmpty()) {
            boolean zEquals = this.f29604.equals(arrayList);
            StringBuilder sb = new StringBuilder("Can't change restrictions from ");
            ArrayList arrayList2 = this.f29604;
            StringBuilder sb2 = new StringBuilder();
            Iterator it = arrayList2.iterator();
            if (it.hasNext()) {
                while (true) {
                    sb2.append((CharSequence) it.next());
                    if (!it.hasNext()) {
                        break;
                    } else {
                        sb2.append((CharSequence) ", ");
                    }
                }
            }
            sb.append(sb2.toString());
            sb.append(" to ");
            StringBuilder sb3 = new StringBuilder();
            Iterator it2 = arrayList.iterator();
            if (it2.hasNext()) {
                while (true) {
                    sb3.append((CharSequence) it2.next());
                    if (!it2.hasNext()) {
                        break;
                    } else {
                        sb3.append((CharSequence) ", ");
                    }
                }
            }
            sb.append(sb3.toString());
            C2023.m6506(sb.toString(), zEquals);
        }
        this.f29604 = arrayList;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m22329(ArrayList arrayList) {
        if (arrayList.isEmpty()) {
            return;
        }
        for (int i = 0; i < arrayList.size(); i++) {
            C19147 c19147 = (C19147) arrayList.get(i);
            String str = c19147.f61848;
            HashMap map = this.f29601;
            C19147 c19148 = (C19147) map.get(str);
            if (c19148 != null) {
                boolean zEquals = c19148.equals(c19147);
                StringBuilder sbM30914 = C12441.m30914("Can't change ", str, " from ");
                sbM30914.append(c19148.f61847);
                sbM30914.append(" ");
                sbM30914.append(c19148.f61846);
                sbM30914.append(" to ");
                sbM30914.append(c19147.f61847);
                sbM30914.append(" ");
                sbM30914.append(c19147.f61846);
                C2023.m6506(sbM30914.toString(), zEquals);
            }
            map.put(str, c19147);
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m22327(Boolean bool) {
        if (bool == null) {
            return;
        }
        Boolean bool2 = this.f29595;
        if (bool2 != null) {
            C2023.m6506("Can't change contentMayVary from " + this.f29595 + " to " + bool, bool2.equals(bool));
        }
        this.f29595 = bool;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m22328(String str) {
        if (str == null) {
            return;
        }
        String str2 = this.f29600;
        if (str2 != null) {
            C2023.m6506("Can't change timelineOccupies from " + this.f29600 + " to " + str, str2.equals(str));
        }
        this.f29600 = str;
    }

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final void m22336(String str) {
        if (str == null) {
            return;
        }
        String str2 = this.f29607;
        if (str2 != null) {
            C2023.m6506("Can't change timelineStyle from " + this.f29607 + " to " + str, str2.equals(str));
        }
        this.f29607 = str;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final C9975 m22324() {
        Uri uri = this.f29597;
        if ((uri != null || this.f29603 == null) && (uri == null || this.f29603 != null)) {
            return null;
        }
        long j = this.f29606;
        if (j == -9223372036854775807L) {
            return null;
        }
        Uri uri2 = this.f29603;
        long j2 = this.f29594;
        long j3 = this.f29609;
        long j4 = this.f29599;
        ArrayList arrayList = this.f29598;
        boolean z = this.f29602;
        long j5 = this.f29608;
        long j6 = this.f29610;
        ArrayList arrayList2 = this.f29605;
        ArrayList arrayList3 = this.f29604;
        ArrayList arrayList4 = new ArrayList(this.f29601.values());
        Boolean bool = this.f29595;
        boolean z2 = bool == null || bool.booleanValue();
        String str = this.f29600;
        if (str == null) {
            str = "POINT";
        }
        String str2 = str;
        String str3 = this.f29607;
        if (str3 == null) {
            str3 = "HIGHLIGHT";
        }
        return new C9975(this.f29596, uri2, uri, j, j2, j3, j4, arrayList, z, j5, j6, arrayList2, arrayList3, arrayList4, z2, str2, str3);
    }
}
