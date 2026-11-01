package l;

import java.util.Arrays;
import java.util.Collection;
import java.util.EnumSet;
import java.util.HashMap;
import java.util.List;
import java.util.Set;
import org.simpleframework.xml.transform.ClassTransform;

/* JADX INFO: renamed from: l.᩺ۤ۟, reason: contains not printable characters */
/* JADX INFO: compiled from: U410 */
/* JADX INFO: loaded from: classes.dex */
public class C22926 implements InterfaceC16910 {

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public boolean f74519;

    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    public EnumSet f74520;

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public HashMap f74521;

    public C22926(Set set) {
        this.f74521 = new HashMap();
        this.f74520 = EnumSet.copyOf((Collection) set);
        m50742(EnumC0681.DEPTH, -1);
        m50742(EnumC0681.LENGTH, -1);
        this.f74519 = true;
    }

    /* JADX WARN: Code duplicated, block: B:40:0x00b3 A[Catch: NumberFormatException -> 0x00bf, TRY_LEAVE, TryCatch #0 {NumberFormatException -> 0x00bf, blocks: (B:29:0x008f, B:35:0x0098, B:37:0x00a0, B:38:0x00ab, B:40:0x00b3), top: B:50:0x008f }] */
    public C22926(C14770 c14770, EnumSet enumSet) {
        this(enumSet);
        String strM35397 = c14770.m35397("diags.showSource");
        if (strM35397 != null) {
            if (strM35397.equals("true")) {
                m50743(EnumC20438.SOURCE, true);
            } else if (strM35397.equals("false")) {
                m50743(EnumC20438.SOURCE, false);
            }
        }
        String strM35398 = c14770.m35397("diags.formatterOptions");
        if (strM35398 != null) {
            List listAsList = Arrays.asList(strM35398.split(","));
            if (listAsList.contains(ClassTransform.SHORT)) {
                m50743(EnumC20438.DETAILS, false);
                m50743(EnumC20438.SUBDIAGNOSTICS, false);
            }
            if (listAsList.contains("source")) {
                m50743(EnumC20438.SOURCE, true);
            }
            if (listAsList.contains("-source")) {
                m50743(EnumC20438.SOURCE, false);
            }
        }
        String strM35399 = c14770.m35397("diags.multilinePolicy");
        if (strM35399 != null) {
            if (strM35399.equals("disabled")) {
                m50743(EnumC20438.SUBDIAGNOSTICS, false);
            } else if (strM35399.startsWith("limit:")) {
                String[] strArrSplit = strM35399.substring(6).split(":");
                try {
                    int length = strArrSplit.length;
                    if (length == 1) {
                        if (!strArrSplit[0].equals("*")) {
                            m50742(EnumC0681.LENGTH, Integer.parseInt(strArrSplit[0]));
                        }
                    } else if (length == 2) {
                        if (!strArrSplit[1].equals("*")) {
                            m50742(EnumC0681.DEPTH, Integer.parseInt(strArrSplit[1]));
                        }
                        if (!strArrSplit[0].equals("*")) {
                            m50742(EnumC0681.LENGTH, Integer.parseInt(strArrSplit[0]));
                        }
                    }
                } catch (NumberFormatException unused) {
                    m50742(EnumC0681.DEPTH, -1);
                    m50742(EnumC0681.LENGTH, -1);
                }
            }
        }
        String strM353910 = c14770.m35397("diags.showCaret");
        if (strM353910 == null || !strM353910.equals("false")) {
            this.f74519 = true;
        } else {
            this.f74519 = false;
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m50742(EnumC0681 enumC0681, int i) {
        if (i < -1) {
            i = -1;
        }
        this.f74521.put(enumC0681, Integer.valueOf(i));
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m50743(EnumC20438 enumC20438, boolean z) {
        if (z) {
            this.f74520.add(enumC20438);
        } else {
            this.f74520.remove(enumC20438);
        }
    }
}
