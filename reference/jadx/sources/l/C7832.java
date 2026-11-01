package l;

import android.graphics.Paint;
import android.text.TextUtils;
import com.google.android.material.motion.MotionUtils;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Iterator;

/* JADX INFO: renamed from: l.۠֡᩺, reason: contains not printable characters */
/* JADX INFO: compiled from: Z81J */
/* JADX INFO: loaded from: classes3.dex */
public final class C7832 {
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static String m20656(C21111 c21111) {
        C2093 c2093 = new C2093();
        PrintWriter printWriter = new PrintWriter(c2093);
        C10529 c10529 = c21111.f68769.f25496;
        float f = c10529.f36047;
        float f2 = c10529.f36042;
        float f3 = c10529.f36050;
        float f4 = c10529.f36049;
        C8412 c8412 = c10529.f36044;
        printWriter.println("<?xml version=\"1.0\" encoding=\"UTF-8\"?>");
        printWriter.print("<svg xmlns=\"http://www.w3.org/2000/svg\"");
        printWriter.print(" width=\"" + f + "\"");
        printWriter.print(" height=\"" + f2 + "\"");
        printWriter.print(" viewBox=\"0 0 " + f3 + " " + f4 + "\"");
        printWriter.println(">");
        ArrayList arrayList = new ArrayList();
        m20658(c8412, arrayList);
        if (!arrayList.isEmpty()) {
            printWriter.println("  <defs>");
            for (int i = 0; i < arrayList.size(); i++) {
                C18289 c18289 = (C18289) arrayList.get(i);
                printWriter.println("    <clipPath id=\"" + C8479.m22141(i, "clip") + "\">");
                String str = c18289.f31054;
                if (!TextUtils.isEmpty(str)) {
                    printWriter.println("      <path d=\"" + str + "\" />");
                }
                printWriter.println("    </clipPath>");
            }
            printWriter.println("  </defs>");
        }
        m20657(c8412, printWriter, 1, arrayList);
        printWriter.println("</svg>");
        printWriter.flush();
        return c2093.toString();
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static void m20658(C8412 c8412, ArrayList arrayList) {
        for (AbstractC19701 abstractC19701 : c8412.f29163) {
            if (abstractC19701 instanceof C18289) {
                arrayList.add((C18289) abstractC19701);
            } else if (abstractC19701 instanceof C8412) {
                m20658((C8412) abstractC19701, arrayList);
            }
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static void m20657(C8412 c8412, PrintWriter printWriter, int i, ArrayList arrayList) {
        int i2;
        int iIndexOf;
        String strM22045 = c8412.m22045();
        float f = c8412.f29165;
        float f2 = c8412.f29170;
        float f3 = c8412.f29169;
        float f4 = c8412.f29160;
        float f5 = c8412.f29167;
        float f6 = c8412.f29161;
        float f7 = c8412.f29164;
        ArrayList arrayList2 = c8412.f29163;
        ArrayList arrayList3 = new ArrayList();
        for (Object obj : arrayList2) {
            if ((obj instanceof C18289) && (iIndexOf = arrayList.indexOf((C18289) obj)) >= 0) {
                arrayList3.add(Integer.valueOf(iIndexOf));
            }
        }
        boolean z = (TextUtils.isEmpty(strM22045) && f == 0.0f && f2 == 0.0f && f3 == 0.0f && f4 == 1.0f && f5 == 1.0f && arrayList2.size() <= 1 && arrayList3.size() <= 0) ? false : true;
        if (z) {
            printWriter.print(m20659(i) + "<g");
            if (!TextUtils.isEmpty(strM22045)) {
                printWriter.print(" id=\"" + strM22045 + "\"");
            }
            if (!arrayList3.isEmpty()) {
                printWriter.print(" clip-path=\"url(#clip" + ((Integer) arrayList3.get(0)).intValue() + ")\"");
            }
            ArrayList arrayList4 = new ArrayList();
            if (f != 0.0f || f2 != 0.0f) {
                arrayList4.add("translate(" + f + " " + f2 + MotionUtils.EASING_TYPE_FORMAT_END);
            }
            if (f3 != 0.0f) {
                if (f6 == 0.0f && f7 == 0.0f) {
                    arrayList4.add("rotate(" + f3 + MotionUtils.EASING_TYPE_FORMAT_END);
                } else {
                    arrayList4.add("rotate(" + f3 + " " + f6 + " " + f7 + MotionUtils.EASING_TYPE_FORMAT_END);
                }
            }
            if (f4 != 1.0f || f5 != 1.0f) {
                arrayList4.add("scale(" + f4 + " " + f5 + MotionUtils.EASING_TYPE_FORMAT_END);
            }
            if (!arrayList4.isEmpty()) {
                StringBuilder sb = new StringBuilder(" transform=\"");
                StringBuilder sb2 = new StringBuilder();
                Iterator it = arrayList4.iterator();
                if (it.hasNext()) {
                    while (true) {
                        sb2.append((CharSequence) it.next());
                        if (!it.hasNext()) {
                            break;
                        } else {
                            sb2.append((CharSequence) " ");
                        }
                    }
                }
                sb.append(sb2.toString());
                sb.append("\"");
                printWriter.print(sb.toString());
            }
            printWriter.println(">");
            i2 = i + 1;
            int size = arrayList3.size();
            int i3 = 1;
            while (i3 < size) {
                printWriter.println(m20659(i2) + "<g clip-path=\"url(#clip" + ((Integer) arrayList3.get(i3)).intValue() + ")\">");
                i3++;
                i2++;
            }
        } else {
            z = z;
            i2 = i;
        }
        for (Object obj2 : arrayList2) {
            if (obj2 instanceof C18995) {
                C18995 c18995 = (C18995) obj2;
                printWriter.print(m20659(i2) + "<path");
                String str = c18995.f31054;
                if (!TextUtils.isEmpty(str)) {
                    printWriter.print(" d=\"" + str + "\"");
                }
                int iM4119 = c18995.f61485.m4119();
                if (iM4119 != 0) {
                    printWriter.print(" fill=\"" + m20655(iM4119) + "\"");
                }
                int iM41110 = c18995.f61480.m4119();
                if (iM41110 != 0) {
                    printWriter.print(" stroke=\"" + m20655(iM41110) + "\"");
                }
                float f8 = c18995.f61481;
                if (f8 > 0.0f) {
                    printWriter.print(" stroke-width=\"" + f8 + "\"");
                }
                Paint.Cap cap = c18995.f61477;
                if (cap != null) {
                    String lowerCase = cap.toString().toLowerCase();
                    if (!"butt".equals(lowerCase)) {
                        printWriter.print(" stroke-linecap=\"" + lowerCase + "\"");
                    }
                }
                Paint.Join join = c18995.f61479;
                if (join != null) {
                    String lowerCase2 = join.toString().toLowerCase();
                    if (!"miter".equals(lowerCase2)) {
                        printWriter.print(" stroke-linejoin=\"" + lowerCase2 + "\"");
                    }
                }
                float f9 = c18995.f61478;
                if (f9 != 1.0f) {
                    printWriter.print(" fill-opacity=\"" + f9 + "\"");
                }
                float f10 = c18995.f61476;
                if (f10 != 1.0f) {
                    printWriter.print(" stroke-opacity=\"" + f10 + "\"");
                }
                printWriter.println(" />");
            } else if (obj2 instanceof C8412) {
                m20657((C8412) obj2, printWriter, i2, arrayList);
            }
        }
        if (z) {
            if (!arrayList3.isEmpty()) {
                int size2 = arrayList3.size();
                for (int i4 = 1; i4 < size2; i4++) {
                    StringBuilder sb3 = new StringBuilder();
                    i2--;
                    sb3.append(m20659(i2));
                    sb3.append("</g>");
                    printWriter.println(sb3.toString());
                }
            }
            printWriter.println(m20659(i2 - 1) + "</g>");
        }
    }

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public static String m20659(int i) {
        StringBuilder sb = new StringBuilder();
        for (int i2 = 0; i2 < i; i2++) {
            sb.append(EnumC19730.f63352);
        }
        return sb.toString();
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static String m20655(int i) {
        return (i & (-16777216)) != -16777216 ? String.format("#%06X%02X", Integer.valueOf(i & 16777215), Integer.valueOf(i >>> 24)) : String.format("#%06X", Integer.valueOf(i & 16777215));
    }
}
