package l;

import java.io.IOException;
import java.text.DateFormat;
import java.util.ArrayList;
import java.util.IdentityHashMap;
import java.util.Locale;
import java.util.TimeZone;

/* JADX INFO: renamed from: l.ۡ᩹ܺ, reason: contains not printable characters */
/* JADX INFO: compiled from: AAVA */
/* JADX INFO: loaded from: classes3.dex */
public final class C9690 {

    /* JADX INFO: renamed from: ۚ, reason: not valid java name and contains not printable characters */
    public final C5372 f31276;

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public final C12829 f31277;

    /* JADX INFO: renamed from: ܳ, reason: not valid java name and contains not printable characters */
    public Locale f31280;

    /* JADX INFO: renamed from: ܺ, reason: not valid java name and contains not printable characters */
    public TimeZone f31281;

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public C15066 f31285;

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public ArrayList f31284 = null;

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public ArrayList f31275 = null;

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public ArrayList f31274 = null;

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public ArrayList f31282 = null;

    /* JADX INFO: renamed from: ۫, reason: not valid java name and contains not printable characters */
    public ArrayList f31279 = null;

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public ArrayList f31278 = null;

    /* JADX INFO: renamed from: ᩴ, reason: not valid java name and contains not printable characters */
    public int f31283 = 0;

    /* JADX INFO: renamed from: ᩻, reason: not valid java name and contains not printable characters */
    public IdentityHashMap f31286 = null;

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final DateFormat m25281() {
        return null;
    }

    public C9690(C5372 c5372, C12829 c12829) {
        TimeZone timeZone = AbstractC12454.f40024;
        this.f31281 = timeZone;
        this.f31280 = AbstractC12454.f40023;
        this.f31276 = c5372;
        this.f31277 = c12829;
        this.f31281 = timeZone;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m25279(C15066 c15066, Object obj, Object obj2) {
        if ((this.f31276.f18847 & EnumC1643.DisableCircularReferenceDetect.f5702) == 0) {
            this.f31285 = new C15066(c15066, obj, obj2, 0);
            if (this.f31286 == null) {
                this.f31286 = new IdentityHashMap();
            }
            this.f31286.put(obj, this.f31285);
        }
    }

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final void m25282(Object obj) {
        C15066 c15066 = this.f31285;
        Object obj2 = c15066.f49196;
        C5372 c5372 = this.f31276;
        if (obj == obj2) {
            c5372.write("{\"$ref\":\"@\"}");
            return;
        }
        C15066 c15067 = c15066.f49198;
        if (c15067 != null && obj == c15067.f49196) {
            c5372.write("{\"$ref\":\"..\"}");
            return;
        }
        while (true) {
            C15066 c15068 = c15066.f49198;
            if (c15068 == null) {
                break;
            } else {
                c15066 = c15068;
            }
        }
        if (obj == c15066.f49196) {
            c5372.write("{\"$ref\":\"$\"}");
            return;
        }
        String string = ((C15066) this.f31286.get(obj)).toString();
        c5372.write("{\"$ref\":\"");
        c5372.write(string);
        c5372.write("\"}");
    }

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public final void m25280() {
        this.f31283++;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m25276() {
        this.f31283--;
    }

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public final void m25283() {
        C5372 c5372 = this.f31276;
        c5372.write(10);
        for (int i = 0; i < this.f31283; i++) {
            c5372.write(9);
        }
    }

    public final String toString() {
        return this.f31276.toString();
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m25277(Object obj) {
        if (obj == null) {
            this.f31276.m16046();
            return;
        }
        try {
            this.f31277.m31835(obj.getClass()).mo3063(this, obj, null, null);
        } catch (IOException e) {
            throw new C4251(e.getMessage(), (Throwable) e);
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m25278(String str) {
        C5372 c5372 = this.f31276;
        if (str == null) {
            if ((c5372.f18847 & EnumC1643.WriteNullStringAsEmpty.f5702) != 0) {
                c5372.m16047("");
                return;
            } else {
                c5372.m16046();
                return;
            }
        }
        if ((c5372.f18847 & EnumC1643.UseSingleQuotes.f5702) != 0) {
            c5372.m16052(str);
        } else {
            c5372.m16048(str, (char) 0, true);
        }
    }
}
