package l;

import java.io.FileNotFoundException;
import java.io.IOException;

/* JADX INFO: renamed from: l.ܶ۫ۨ, reason: contains not printable characters */
/* JADX INFO: compiled from: A4DP */
/* JADX INFO: loaded from: classes4.dex */
public final class C16092 {

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public boolean f52133;

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C20568 f52134;

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final C23552 f52135;

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public final boolean[] f52136;

    public C16092(C20568 c20568, C23552 c23552) {
        this.f52134 = c20568;
        this.f52135 = c23552;
        this.f52136 = c23552.f76081 ? null : new boolean[c20568.f65878];
    }

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public final void m38248() {
        C23552 c23552 = this.f52135;
        if (c23552.f76083 != this) {
            return;
        }
        int i = 0;
        while (true) {
            C20568 c20568 = this.f52134;
            if (i < c20568.f65878) {
                try {
                    c20568.f65883.mo17579(c23552.f76079[i]);
                } catch (IOException unused) {
                }
                i++;
            } else {
                c23552.f76083 = null;
                return;
            }
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final InterfaceC7099 m38246(int i) {
        synchronized (this.f52134) {
            if (this.f52133) {
                throw new IllegalStateException();
            }
            C23552 c23552 = this.f52135;
            if (c23552.f76083 != this) {
                return C14556.m35103();
            }
            if (!c23552.f76081) {
                this.f52136[i] = true;
            }
            try {
                return new C17584(this, this.f52134.f65883.mo17580(c23552.f76079[i]));
            } catch (FileNotFoundException unused) {
                return C14556.m35103();
            }
        }
    }

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final void m38249() {
        synchronized (this.f52134) {
            if (this.f52133) {
                throw new IllegalStateException();
            }
            if (this.f52135.f76083 == this) {
                this.f52134.m47157(this, true);
            }
            this.f52133 = true;
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m38247() {
        synchronized (this.f52134) {
            if (this.f52133) {
                throw new IllegalStateException();
            }
            if (this.f52135.f76083 == this) {
                this.f52134.m47157(this, false);
            }
            this.f52133 = true;
        }
    }
}
