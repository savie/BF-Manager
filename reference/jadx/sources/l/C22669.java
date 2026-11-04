package l;

import android.net.Uri;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;

/* JADX INFO: renamed from: l.᩸۠ۙ, reason: contains not printable characters */
/* JADX INFO: compiled from: U7MS */
/* JADX INFO: loaded from: classes.dex */
public final class C22669 {

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final String f73616;

    /* JADX INFO: renamed from: ۗ, reason: not valid java name and contains not printable characters */
    public String f73617;

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public Uri f73618;

    /* JADX INFO: renamed from: ۚ, reason: not valid java name and contains not printable characters */
    public boolean f73619;

    /* JADX INFO: renamed from: ᩵, reason: not valid java name and contains not printable characters */
    public String f73628;

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public Uri f73629;

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public Boolean f73630;

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public final HashMap f73620 = new HashMap();

    /* JADX INFO: renamed from: ᩹, reason: not valid java name and contains not printable characters */
    public long f73631 = -9223372036854775807L;

    /* JADX INFO: renamed from: ۫, reason: not valid java name and contains not printable characters */
    public long f73622 = -9223372036854775807L;

    /* JADX INFO: renamed from: ܳ, reason: not valid java name and contains not printable characters */
    public long f73623 = -9223372036854775807L;

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public long f73621 = -9223372036854775807L;

    /* JADX INFO: renamed from: ᩴ, reason: not valid java name and contains not printable characters */
    public ArrayList f73627 = new ArrayList();

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public long f73626 = -9223372036854775807L;

    /* JADX INFO: renamed from: ᩻, reason: not valid java name and contains not printable characters */
    public long f73632 = -9223372036854775807L;

    /* JADX INFO: renamed from: ܶ, reason: not valid java name and contains not printable characters */
    public ArrayList f73624 = new ArrayList();

    /* JADX INFO: renamed from: ܺ, reason: not valid java name and contains not printable characters */
    public ArrayList f73625 = new ArrayList();

    public C22669(String str) {
        this.f73616 = str;
    }

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final void m51144(Uri uri) {
        if (uri == null) {
            return;
        }
        Uri uri2 = this.f73629;
        if (uri2 != null) {
            C20782.m47564("Can't change assetUri from " + this.f73629 + " to " + uri, uri2.equals(uri));
        }
        this.f73629 = uri;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m51134(Uri uri) {
        if (uri == null) {
            return;
        }
        Uri uri2 = this.f73618;
        if (uri2 != null) {
            C20782.m47564("Can't change assetListUri from " + this.f73618 + " to " + uri, uri2.equals(uri));
        }
        this.f73618 = uri;
    }

    /* JADX INFO: renamed from: ܳ, reason: not valid java name and contains not printable characters */
    public final void m51141(long j) {
        if (j == -9223372036854775807L) {
            return;
        }
        long j2 = this.f73631;
        if (j2 != -9223372036854775807L) {
            C20782.m47564("Can't change startDateUnixUs from " + this.f73631 + " to " + j, j2 == j);
        }
        this.f73631 = j;
    }

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final void m51143(long j) {
        if (j == -9223372036854775807L) {
            return;
        }
        long j2 = this.f73622;
        if (j2 != -9223372036854775807L) {
            C20782.m47564("Can't change endDateUnixUs from " + this.f73622 + " to " + j, j2 == j);
        }
        this.f73622 = j;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m51133(long j) {
        if (j == -9223372036854775807L) {
            return;
        }
        long j2 = this.f73623;
        if (j2 != -9223372036854775807L) {
            C20782.m47564("Can't change durationUs from " + this.f73623 + " to " + j, j2 == j);
        }
        this.f73623 = j;
    }

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public final void m51139(long j) {
        if (j == -9223372036854775807L) {
            return;
        }
        long j2 = this.f73621;
        if (j2 != -9223372036854775807L) {
            C20782.m47564("Can't change plannedDurationUs from " + this.f73621 + " to " + j, j2 == j);
        }
        this.f73621 = j;
    }

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final void m51146(ArrayList arrayList) {
        if (arrayList.isEmpty()) {
            return;
        }
        if (!this.f73627.isEmpty()) {
            boolean zEquals = this.f73627.equals(arrayList);
            StringBuilder sb = new StringBuilder("Can't change cue from ");
            ArrayList arrayList2 = this.f73627;
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
            C20782.m47564(sb.toString(), zEquals);
        }
        this.f73627 = arrayList;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m51138(boolean z) {
        if (z) {
            this.f73619 = true;
        }
    }

    /* JADX INFO: renamed from: ᩴ, reason: not valid java name and contains not printable characters */
    public final void m51142(long j) {
        if (j == -9223372036854775807L) {
            return;
        }
        long j2 = this.f73626;
        if (j2 != -9223372036854775807L) {
            C20782.m47564("Can't change resumeOffsetUs from " + this.f73626 + " to " + j, j2 == j);
        }
        this.f73626 = j;
    }

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public final void m51147(long j) {
        if (j == -9223372036854775807L) {
            return;
        }
        long j2 = this.f73632;
        if (j2 != -9223372036854775807L) {
            C20782.m47564("Can't change playoutLimitUs from " + this.f73632 + " to " + j, j2 == j);
        }
        this.f73632 = j;
    }

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public final void m51148(ArrayList arrayList) {
        if (arrayList.isEmpty()) {
            return;
        }
        if (!this.f73624.isEmpty()) {
            boolean zEquals = this.f73624.equals(arrayList);
            StringBuilder sb = new StringBuilder("Can't change snapTypes from ");
            ArrayList arrayList2 = this.f73624;
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
            C20782.m47564(sb.toString(), zEquals);
        }
        this.f73624 = arrayList;
    }

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public final void m51140(ArrayList arrayList) {
        if (arrayList.isEmpty()) {
            return;
        }
        if (!this.f73625.isEmpty()) {
            boolean zEquals = this.f73625.equals(arrayList);
            StringBuilder sb = new StringBuilder("Can't change restrictions from ");
            ArrayList arrayList2 = this.f73625;
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
            C20782.m47564(sb.toString(), zEquals);
        }
        this.f73625 = arrayList;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m51137(ArrayList arrayList) {
        if (arrayList.isEmpty()) {
            return;
        }
        for (int i = 0; i < arrayList.size(); i++) {
            C10734 c10734 = (C10734) arrayList.get(i);
            String str = c10734.f34087;
            HashMap map = this.f73620;
            C10734 c10735 = (C10734) map.get(str);
            if (c10735 != null) {
                boolean zEquals = c10735.equals(c10734);
                StringBuilder sbM51387 = C22783.m51387("Can't change ", str, " from ");
                sbM51387.append(c10735.f34086);
                sbM51387.append(" ");
                sbM51387.append(c10735.f34085);
                sbM51387.append(" to ");
                sbM51387.append(c10734.f34086);
                sbM51387.append(" ");
                sbM51387.append(c10734.f34085);
                C20782.m47564(sbM51387.toString(), zEquals);
            }
            map.put(str, c10734);
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m51135(Boolean bool) {
        if (bool == null) {
            return;
        }
        Boolean bool2 = this.f73630;
        if (bool2 != null) {
            C20782.m47564("Can't change contentMayVary from " + this.f73630 + " to " + bool, bool2.equals(bool));
        }
        this.f73630 = bool;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m51136(String str) {
        if (str == null) {
            return;
        }
        String str2 = this.f73617;
        if (str2 != null) {
            C20782.m47564("Can't change timelineOccupies from " + this.f73617 + " to " + str, str2.equals(str));
        }
        this.f73617 = str;
    }

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final void m51145(String str) {
        if (str == null) {
            return;
        }
        String str2 = this.f73628;
        if (str2 != null) {
            C20782.m47564("Can't change timelineStyle from " + this.f73628 + " to " + str, str2.equals(str));
        }
        this.f73628 = str;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final C19685 m51132() {
        Uri uri = this.f73618;
        if ((uri != null || this.f73629 == null) && (uri == null || this.f73629 != null)) {
            return null;
        }
        long j = this.f73631;
        if (j == -9223372036854775807L) {
            return null;
        }
        Uri uri2 = this.f73629;
        long j2 = this.f73622;
        long j3 = this.f73623;
        long j4 = this.f73621;
        ArrayList arrayList = this.f73627;
        boolean z = this.f73619;
        long j5 = this.f73626;
        long j6 = this.f73632;
        ArrayList arrayList2 = this.f73624;
        ArrayList arrayList3 = this.f73625;
        ArrayList arrayList4 = new ArrayList(this.f73620.values());
        Boolean bool = this.f73630;
        boolean z2 = bool == null || bool.booleanValue();
        String str = this.f73617;
        if (str == null) {
            str = "POINT";
        }
        String str2 = str;
        String str3 = this.f73628;
        if (str3 == null) {
            str3 = "HIGHLIGHT";
        }
        return new C19685(this.f73616, uri2, uri, j, j2, j3, j4, arrayList, z, j5, j6, arrayList2, arrayList3, arrayList4, z2, str2, str3);
    }
}
