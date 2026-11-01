package l;

import android.view.View;
import android.view.ViewGroup;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.StringReader;

/* JADX INFO: renamed from: l.ۘܳ᩺, reason: contains not printable characters */
/* JADX INFO: compiled from: K7K5 */
/* JADX INFO: loaded from: classes3.dex */
public final class C4010 implements InterfaceC19429, InterfaceC7112 {
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static boolean m11515(int i) {
        int i2;
        if (i < -1) {
            return false;
        }
        return i == -1 || (i2 = i & 255) == 0 || i2 == 255 || (i & 65280) == 0;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static View m11514(ViewGroup viewGroup, float f, float f2) {
        View viewM11514;
        float scrollX = f + viewGroup.getScrollX();
        float scrollY = f2 + viewGroup.getScrollY();
        for (int i = 0; i < viewGroup.getChildCount(); i++) {
            View childAt = viewGroup.getChildAt(i);
            int left = childAt.getLeft();
            int top = childAt.getTop();
            int right = childAt.getRight();
            int bottom = childAt.getBottom();
            if (scrollX >= left && scrollX <= right && scrollY >= top && scrollY <= bottom) {
                return (!(childAt instanceof ViewGroup) || (viewM11514 = m11514((ViewGroup) childAt, scrollX - ((float) childAt.getLeft()), scrollY - ((float) childAt.getTop()))) == null) ? childAt : viewM11514;
            }
        }
        return null;
    }

    @Override // l.InterfaceC7112
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public void mo11516(CharSequence charSequence, C12052 c12052, C18503 c18503) throws IOException {
        String string = charSequence.toString();
        C8255 c8255 = new C8255();
        c8255.f28707 = true;
        c8255.f28708 = 28;
        C19213 c19213M18449 = C6843.m18449(string, c8255.m21646(), c8255);
        C20424 c20424 = new C20424();
        c20424.f66198 = 28;
        C14795 c14795 = new C14795();
        BufferedReader bufferedReader = new BufferedReader(new StringReader(string));
        while (true) {
            String line = bufferedReader.readLine();
            if (line == null) {
                break;
            }
            String strTrim = line.trim();
            if (!strTrim.startsWith("#")) {
                break;
            }
            c14795.m35466(strTrim);
            c14795.append('\n');
        }
        C16191.m38283(new C2093(c14795), c19213M18449, c20424);
        c18503.append((CharSequence) c14795.toString());
    }
}
