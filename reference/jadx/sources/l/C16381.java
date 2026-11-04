package l;

import android.graphics.Matrix;
import android.graphics.Paint;
import android.text.TextUtils;
import java.io.PrintWriter;
import java.util.ArrayList;

/* JADX INFO: renamed from: l.ܶ᩸ܺ, reason: contains not printable characters */
/* JADX INFO: compiled from: Z81J */
/* JADX INFO: loaded from: classes4.dex */
public final class C16381 {
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static String m38875(C24236 c24236) {
        C0560 c0560 = new C0560();
        PrintWriter printWriter = new PrintWriter(c0560);
        C12301 c12301 = c24236.f78491.f21456;
        float f = c12301.f39550;
        float f2 = c12301.f39540;
        float f3 = c12301.f39552;
        float f4 = c12301.f39546;
        C23490 c23490 = c12301.f39543;
        printWriter.println("<?xml version=\"1.0\" encoding=\"UTF-8\"?>");
        printWriter.print("<svg xmlns=\"http://www.w3.org/2000/svg\"");
        printWriter.print(" width=\"" + f + "\"");
        printWriter.print(" height=\"" + f2 + "\"");
        printWriter.print(" viewBox=\"0 0 " + f3 + " " + f4 + "\"");
        printWriter.println(">");
        ArrayList arrayList = new ArrayList();
        m38877(c23490, arrayList);
        if (!arrayList.isEmpty()) {
            printWriter.println("  <defs>");
            for (int i = 0; i < arrayList.size(); i++) {
                C17522 c17522 = (C17522) arrayList.get(i);
                printWriter.println("    <clipPath id=\"" + C13645.m33382(i, "clip") + "\">");
                String str = c17522.f65697;
                if (!TextUtils.isEmpty(str)) {
                    printWriter.println("      <path d=\"" + str + "\" />");
                }
                printWriter.println("    </clipPath>");
            }
            printWriter.println("  </defs>");
        }
        m38876(c23490, printWriter, 1, arrayList);
        printWriter.println("</svg>");
        printWriter.flush();
        return c0560.toString();
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static void m38877(C23490 c23490, ArrayList arrayList) {
        for (AbstractC3352 abstractC3352 : c23490.f75951) {
            if (abstractC3352 instanceof C17522) {
                arrayList.add((C17522) abstractC3352);
            } else if (abstractC3352 instanceof C23490) {
                m38877((C23490) abstractC3352, arrayList);
            }
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static void m38876(C23490 c23490, PrintWriter printWriter, int i, ArrayList arrayList) {
        int iIndexOf;
        String strM52684 = c23490.m52684();
        Matrix matrix = c23490.f75953;
        boolean zIsIdentity = matrix.isIdentity();
        ArrayList arrayList2 = c23490.f75951;
        ArrayList arrayList3 = new ArrayList();
        for (Object obj : arrayList2) {
            if ((obj instanceof C17522) && (iIndexOf = arrayList.indexOf((C17522) obj)) >= 0) {
                arrayList3.add(Integer.valueOf(iIndexOf));
            }
        }
        boolean z = !TextUtils.isEmpty(strM52684) || !zIsIdentity || arrayList2.size() > 1 || arrayList3.size() > 0;
        if (z) {
            printWriter.print(m38878(i) + "<g");
            if (!TextUtils.isEmpty(strM52684)) {
                printWriter.print(" id=\"" + strM52684 + "\"");
            }
            if (!arrayList3.isEmpty()) {
                printWriter.print(" clip-path=\"url(#clip" + ((Integer) arrayList3.get(0)).intValue() + ")\"");
            }
            if (!zIsIdentity) {
                float[] fArr = new float[9];
                matrix.getValues(fArr);
                printWriter.print(" transform=\"matrix(" + fArr[0] + " " + fArr[3] + " " + fArr[1] + " " + fArr[4] + " " + fArr[2] + " " + fArr[5] + ")\"");
            }
            printWriter.println(">");
            i++;
            int size = arrayList3.size();
            int i2 = 1;
            while (i2 < size) {
                printWriter.println(m38878(i) + "<g clip-path=\"url(#clip" + ((Integer) arrayList3.get(i2)).intValue() + ")\">");
                i2++;
                i++;
            }
        }
        for (Object obj2 : arrayList2) {
            if (!(obj2 instanceof C16030)) {
                if (obj2 instanceof C23490) {
                    m38876((C23490) obj2, printWriter, i, arrayList);
                }
            } else {
                C16030 c16030 = (C16030) obj2;
                printWriter.print(m38878(i) + "<path");
                String str = c16030.f65697;
                if (!TextUtils.isEmpty(str)) {
                    printWriter.print(" d=\"" + str + "\"");
                }
                int iM40901 = c16030.f52003.m40901();
                if (iM40901 != 0) {
                    printWriter.print(" fill=\"" + m38874(iM40901) + "\"");
                }
                int iM40902 = c16030.f52000.m40901();
                if (iM40902 != 0) {
                    printWriter.print(" stroke=\"" + m38874(iM40902) + "\"");
                }
                float f = c16030.f52005;
                if (f > 0.0f) {
                    printWriter.print(" stroke-width=\"" + f + "\"");
                }
                Paint.Cap cap = c16030.f51999;
                if (cap != null) {
                    String lowerCase = cap.toString().toLowerCase();
                    if (!"butt".equals(lowerCase)) {
                        printWriter.print(" stroke-linecap=\"" + lowerCase + "\"");
                    }
                }
                Paint.Join join = c16030.f52001;
                if (join != null) {
                    String lowerCase2 = join.toString().toLowerCase();
                    if (!"miter".equals(lowerCase2)) {
                        printWriter.print(" stroke-linejoin=\"" + lowerCase2 + "\"");
                    }
                }
                float f2 = c16030.f52007;
                if (f2 != 1.0f) {
                    printWriter.print(" fill-opacity=\"" + f2 + "\"");
                }
                float f3 = c16030.f52002;
                if (f3 != 1.0f) {
                    printWriter.print(" stroke-opacity=\"" + f3 + "\"");
                }
                printWriter.println(" />");
            }
        }
        if (z) {
            if (!arrayList3.isEmpty()) {
                int size2 = arrayList3.size();
                for (int i3 = 1; i3 < size2; i3++) {
                    StringBuilder sb = new StringBuilder();
                    i--;
                    sb.append(m38878(i));
                    sb.append("</g>");
                    printWriter.println(sb.toString());
                }
            }
            printWriter.println(m38878(i - 1) + "</g>");
        }
    }

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public static String m38878(int i) {
        StringBuilder sb = new StringBuilder();
        for (int i2 = 0; i2 < i; i2++) {
            sb.append(EnumC7687.f25319);
        }
        return sb.toString();
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static String m38874(int i) {
        return (i & (-16777216)) != -16777216 ? String.format("#%06X%02X", Integer.valueOf(i & 16777215), Integer.valueOf(i >>> 24)) : String.format("#%06X", Integer.valueOf(i & 16777215));
    }
}
