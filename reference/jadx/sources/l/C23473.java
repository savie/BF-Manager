package l;

import java.io.IOException;
import java.text.DateFormat;
import java.util.ArrayList;
import java.util.IdentityHashMap;
import java.util.Locale;
import java.util.TimeZone;

/* JADX INFO: renamed from: l.᩻ۙܶ, reason: contains not printable characters */
/* JADX INFO: compiled from: AAVA */
/* JADX INFO: loaded from: classes.dex */
public final class C23473 {

    /* JADX INFO: renamed from: ۖ, reason: not valid java name and contains not printable characters */
    public C22330 f76000;

    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    public final C1162 f76005;

    /* JADX INFO: renamed from: ۬, reason: not valid java name and contains not printable characters */
    public final C13158 f76006;

    /* JADX INFO: renamed from: ܶ, reason: not valid java name and contains not printable characters */
    public TimeZone f76008;

    /* JADX INFO: renamed from: ᩹, reason: not valid java name and contains not printable characters */
    public Locale f76010;

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public ArrayList f76007 = null;

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public ArrayList f76002 = null;

    /* JADX INFO: renamed from: ۘ, reason: not valid java name and contains not printable characters */
    public ArrayList f76001 = null;

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public ArrayList f76009 = null;

    /* JADX INFO: renamed from: ֨, reason: not valid java name and contains not printable characters */
    public ArrayList f75999 = null;

    /* JADX INFO: renamed from: ۜ, reason: not valid java name and contains not printable characters */
    public ArrayList f76004 = null;

    /* JADX INFO: renamed from: ۚ, reason: not valid java name and contains not printable characters */
    public int f76003 = 0;

    /* JADX INFO: renamed from: ᩺, reason: not valid java name and contains not printable characters */
    public IdentityHashMap f76011 = null;

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final DateFormat m51729() {
        return null;
    }

    public C23473(C13158 c13158, C1162 c1162) {
        TimeZone timeZone = AbstractC8620.f29746;
        this.f76008 = timeZone;
        this.f76010 = AbstractC8620.f29748;
        this.f76006 = c13158;
        this.f76005 = c1162;
        this.f76008 = timeZone;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m51727(C22330 c22330, Object obj, Object obj2) {
        if ((this.f76006.f43818 & EnumC3984.DisableCircularReferenceDetect.f14811) == 0) {
            this.f76000 = new C22330(c22330, obj, obj2, 0);
            if (this.f76011 == null) {
                this.f76011 = new IdentityHashMap();
            }
            this.f76011.put(obj, this.f76000);
        }
    }

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final void m51730(Object obj) {
        C22330 c22330 = this.f76000;
        Object obj2 = c22330.f72910;
        C13158 c13158 = this.f76006;
        if (obj == obj2) {
            c13158.write("{\"$ref\":\"@\"}");
            return;
        }
        C22330 c22331 = c22330.f72908;
        if (c22331 != null && obj == c22331.f72910) {
            c13158.write("{\"$ref\":\"..\"}");
            return;
        }
        while (true) {
            C22330 c22332 = c22330.f72908;
            if (c22332 == null) {
                break;
            } else {
                c22330 = c22332;
            }
        }
        if (obj == c22330.f72910) {
            c13158.write("{\"$ref\":\"$\"}");
            return;
        }
        String string = ((C22330) this.f76011.get(obj)).toString();
        c13158.write("{\"$ref\":\"");
        c13158.write(string);
        c13158.write("\"}");
    }

    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    public final void m51728() {
        this.f76003++;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m51724() {
        this.f76003--;
    }

    /* JADX INFO: renamed from: ۖ, reason: not valid java name and contains not printable characters */
    public final void m51723() {
        C13158 c13158 = this.f76006;
        c13158.write(10);
        for (int i = 0; i < this.f76003; i++) {
            c13158.write(9);
        }
    }

    public final String toString() {
        return this.f76006.toString();
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m51725(Object obj) {
        if (obj == null) {
            this.f76006.m32530();
            return;
        }
        try {
            this.f76005.m4271(obj.getClass()).mo1396(this, obj, null, null);
        } catch (IOException e) {
            throw new C20614(e.getMessage(), (Throwable) e);
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m51726(String str) {
        C13158 c13158 = this.f76006;
        if (str == null) {
            if ((c13158.f43818 & EnumC3984.WriteNullStringAsEmpty.f14811) != 0) {
                c13158.m32531("");
                return;
            } else {
                c13158.m32530();
                return;
            }
        }
        if ((c13158.f43818 & EnumC3984.UseSingleQuotes.f14811) != 0) {
            c13158.m32536(str);
        } else {
            c13158.m32532(str, (char) 0, true);
        }
    }
}
