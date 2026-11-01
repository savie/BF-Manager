package l;

import android.database.Cursor;
import android.net.Uri;
import android.os.Bundle;
import com.alipay.sdk.m.y.o;
import com.google.android.material.motion.MotionUtils;
import java.io.File;
import java.io.IOException;
import java.util.concurrent.Callable;

/* JADX INFO: renamed from: l.ܿ᩷ۚ, reason: contains not printable characters */
/* JADX INFO: compiled from: 49SV */
/* JADX INFO: loaded from: classes5.dex */
public final class C17589 extends C23235 {

    /* JADX INFO: renamed from: ۗ, reason: not valid java name and contains not printable characters */
    public C12651 f55916;

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: ᩸ۨ, reason: not valid java name and contains not printable characters */
    public synchronized boolean m40896() {
        if (this.f55916 != null) {
            return true;
        }
        Cursor cursorQuery = C16737.m39259().query(C22529.m50046(mo40127()), new String[]{"mt_extras"}, null, null, null);
        if (cursorQuery != null) {
            try {
                if (cursorQuery.moveToNext() && !cursorQuery.isNull(0)) {
                    this.f55916 = m40895(cursorQuery.getString(0));
                    cursorQuery.close();
                    return true;
                }
            } catch (Throwable th) {
                try {
                    cursorQuery.close();
                } catch (Throwable th2) {
                    th.addSuppressed(th2);
                }
                throw th;
            }
        }
        if (cursorQuery != null) {
            cursorQuery.close();
        }
        return false;
    }

    @Override // l.AbstractC20745
    /* JADX INFO: renamed from: ֨, reason: not valid java name and contains not printable characters */
    public final C17589 mo40898() {
        return this;
    }

    @Override // l.C23235, l.AbstractC23089
    /* JADX INFO: renamed from: ۗܰ, reason: not valid java name and contains not printable characters */
    public final boolean mo40900() {
        return true;
    }

    @Override // l.C23235, l.AbstractC23089
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void mo40904(File file, Uri uri, boolean z) {
    }

    @Override // l.AbstractC20745
    /* JADX INFO: renamed from: ۤܰ */
    public final boolean mo8448() {
        return true;
    }

    @Override // l.C23235, l.AbstractC23089, l.C22383, l.AbstractC20745
    /* JADX INFO: renamed from: ۧ */
    public final boolean mo33975() {
        if (this.f55916 != null) {
            return true;
        }
        return super.mo33975();
    }

    @Override // l.C23235, l.AbstractC23089, l.C22383
    /* JADX INFO: renamed from: ֡ܰ, reason: not valid java name and contains not printable characters */
    public final void mo40897() {
        super.mo40897();
        this.f55916 = null;
    }

    @Override // l.C23235, l.AbstractC23089
    /* JADX INFO: renamed from: ۙ */
    public final AbstractC23089 mo32854(File file, Uri uri) {
        return new C17589(file, uri, m51272());
    }

    @Override // l.C23235, l.AbstractC23089
    /* JADX INFO: renamed from: ۙ */
    public final C23235 mo32854(File file, Uri uri) {
        return new C17589(file, uri, m51272());
    }

    @Override // l.AbstractC23089
    /* JADX INFO: renamed from: ۧܰ, reason: not valid java name and contains not printable characters */
    public final String[] mo40907() {
        return new String[]{"document_id", "_display_name", "mime_type", "_size", "last_modified", "mt_extras", "mt_path"};
    }

    @Override // l.AbstractC23089
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final AbstractC20745 mo40903(File file, Uri uri, Cursor cursor) {
        C17589 c17589Mo40898 = super.mo40903(file, uri, cursor).mo40898();
        if (!cursor.isNull(5)) {
            c17589Mo40898.f55916 = m40895(cursor.getString(5));
        }
        return c17589Mo40898;
    }

    @Override // l.AbstractC23089
    /* JADX INFO: renamed from: ܿܰ, reason: not valid java name and contains not printable characters */
    public final String[] mo40910() {
        return new String[]{"mime_type", "_size", "last_modified", "mt_path", "mt_extras"};
    }

    @Override // l.AbstractC23089
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final C5928 mo40902(Cursor cursor) {
        return m40888(cursor, 0, 1, 2, 4);
    }

    @Override // l.AbstractC23089
    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final C5928 mo40909(Cursor cursor) {
        return m40888(cursor, 2, 3, 4, 5);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    private C5928 m40888(Cursor cursor, int i, int i2, int i3, int i4) throws IOException {
        EnumC12279 enumC12279;
        long j = cursor.isNull(i2) ? -1L : cursor.getLong(i2);
        long j2 = cursor.isNull(i3) ? -1L : cursor.getLong(i3);
        if (m40906()) {
            return new C5928(this, EnumC12279.DIRECTORY, -1L, j2, null);
        }
        boolean zIsNull = cursor.isNull(i4);
        File file = this.f75029;
        if (!zIsNull) {
            try {
                C12651 c12651M40895 = m40895(cursor.getString(i4));
                char cM31446 = c12651M40895.m31446();
                if (cM31446 == '-') {
                    enumC12279 = EnumC12279.REGULAR;
                } else if (cM31446 == 'd') {
                    enumC12279 = EnumC12279.DIRECTORY;
                } else if (cM31446 == 'l') {
                    enumC12279 = EnumC12279.LINK;
                } else {
                    enumC12279 = EnumC12279.OTHER;
                }
                EnumC12279 enumC122710 = enumC12279;
                EnumC12279 enumC122711 = EnumC12279.LINK;
                if (enumC122710 == enumC122711 && c12651M40895.m31445() == null) {
                    throw new IOException("Missing MT provider link target: " + file.getPath());
                }
                return new C5928(this, enumC122710, enumC122710 == EnumC12279.DIRECTORY ? -1L : j, j2, enumC122710 == enumC122711 ? c12651M40895.m31445() : null);
            } catch (RuntimeException e) {
                throw new IOException("Invalid MT provider metadata: " + file.getPath(), e);
            }
        }
        if (this.f75397) {
            return m51098(cursor, i, i2, i3);
        }
        throw new IOException("Missing MT provider metadata: " + file.getPath());
    }

    /* JADX INFO: renamed from: ᩴ, reason: not valid java name and contains not printable characters */
    public static C12651 m40895(String str) {
        String[] strArrSplit = str.split("\\|", 4);
        return new C12651(Integer.parseInt(strArrSplit[0]), Integer.parseInt(strArrSplit[1]), Integer.parseInt(strArrSplit[2]), strArrSplit.length == 4 ? strArrSplit[3] : null);
    }

    /* JADX INFO: renamed from: ۜۨ, reason: not valid java name and contains not printable characters */
    public final boolean m40906() {
        C18295 c18295M51272 = m51272();
        File file = this.f75029;
        String path = file.getParentFile().getPath();
        if (path.length() != 18 ? false : path.equalsIgnoreCase(c18295M51272.m42503())) {
            String name = file.getName();
            name.getClass();
            switch (name) {
                case "user_de_data":
                case "android_data":
                case "data":
                case "android_obb":
                    return true;
            }
        }
        return false;
    }

    @Override // l.AbstractC20745
    /* JADX INFO: renamed from: ۙ */
    public final boolean mo32855(long j) {
        Uri uriMo40127 = mo40127();
        Bundle bundle = new Bundle();
        bundle.putParcelable("uri", uriMo40127);
        bundle.putLong("time", j);
        Bundle bundleCall = C16737.m39259().call(uriMo40127, "mt:setLastModified", (String) null, bundle);
        if (bundleCall == null) {
            return false;
        }
        if (bundleCall.getBoolean(o.c)) {
            C6860 c6860 = this.f75028;
            if (c6860 == null) {
                return true;
            }
            c6860.f23140 = j;
            return true;
        }
        String string = bundleCall.getString("message");
        if (string == null) {
            return false;
        }
        System.err.println(string);
        return false;
    }

    @Override // l.AbstractC20745
    /* JADX INFO: renamed from: ۙ */
    public final AbstractC3810 mo8444(InterfaceC12984 interfaceC12984) {
        return new C16884(this, this, interfaceC12984);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final boolean m40905(int i) {
        Uri uriMo40127 = mo40127();
        Bundle bundle = new Bundle();
        bundle.putParcelable("uri", uriMo40127);
        bundle.putInt("permissions", i);
        Bundle bundleCall = C16737.m39259().call(uriMo40127, "mt:setPermissions", (String) null, bundle);
        if (bundleCall == null) {
            return false;
        }
        if (bundleCall.getBoolean(o.c)) {
            C12651 c12651 = this.f55916;
            if (c12651 == null) {
                return true;
            }
            c12651.f42260 = i | (c12651.f42260 & (-4096));
            return true;
        }
        String string = bundleCall.getString("message");
        if (string == null) {
            return false;
        }
        System.err.println(string);
        return false;
    }

    /* JADX INFO: renamed from: ֨ۨ, reason: not valid java name and contains not printable characters */
    public final String m40899() {
        if (C13890.m33728()) {
            return (String) C22383.m49650(new Callable() { // from class: l.᩶᩷ۚ
                @Override // java.util.concurrent.Callable
                public final Object call() {
                    return this.f66158.m40893();
                }
            }, this.f75029.getPath(), 500);
        }
        return m40893();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: ܶۨ, reason: not valid java name and contains not printable characters */
    public String m40893() {
        Cursor cursorQuery = C16737.m39259().query(C22529.m50046(mo40127()), new String[]{"mt_path"}, null, null, null);
        if (cursorQuery != null) {
            try {
                if (cursorQuery.moveToNext() && !cursorQuery.isNull(0)) {
                    String string = cursorQuery.getString(0);
                    cursorQuery.close();
                    return string;
                }
            } catch (Throwable th) {
                try {
                    cursorQuery.close();
                } catch (Throwable th2) {
                    th.addSuppressed(th2);
                }
                throw th;
            }
        }
        if (cursorQuery != null) {
            cursorQuery.close();
        }
        return this.f75029.getPath();
    }

    @Override // l.AbstractC20745
    /* JADX INFO: renamed from: ۚۙ */
    public final String mo33968() {
        if (m40906()) {
            return m40899();
        }
        m40912();
        C12651 c12651 = this.f55916;
        if (c12651 != null) {
            return c12651.f42263;
        }
        return null;
    }

    @Override // l.AbstractC20745
    /* JADX INFO: renamed from: ۬ۙ, reason: not valid java name and contains not printable characters */
    public final AbstractC20745 mo40908() {
        return C5553.m15313(m40899(), new String[0]).m46711();
    }

    @Override // l.AbstractC20745
    /* JADX INFO: renamed from: ᩸ۙ, reason: not valid java name and contains not printable characters */
    public final String mo40911() {
        return m46723() ? m46714() : m40899();
    }

    @Override // l.AbstractC20745
    /* JADX INFO: renamed from: ۨ */
    public final void mo33977(final String str) throws IOException {
        if (C13890.m33728()) {
            C22383.m49649(new Callable() { // from class: l.֡᩷ۚ
                @Override // java.util.concurrent.Callable
                public final Object call() throws IOException {
                    this.f2771.m40894(str);
                    return null;
                }
            });
        } else {
            m40894(str);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public void m40894(String str) throws IOException {
        Uri uriMo40127 = mo40127();
        Bundle bundle = new Bundle();
        bundle.putParcelable("uri", uriMo40127);
        bundle.putString(MotionUtils.EASING_TYPE_PATH, str);
        Bundle bundleCall = C16737.m39259().call(uriMo40127, "mt:createSymlink", (String) null, bundle);
        if (bundleCall != null) {
            if (bundleCall.getBoolean(o.c)) {
                return;
            }
            String string = bundleCall.getString("message");
            if (string != null) {
                throw new IOException(string);
            }
        }
        throw new IOException("Unable to create link '" + this.f75029.getPath() + "' to '" + str + "'");
    }

    /* JADX INFO: renamed from: ᩺ۨ, reason: not valid java name and contains not printable characters */
    public final boolean m40912() {
        if (this.f55916 != null) {
            return true;
        }
        if (C13890.m33728()) {
            return ((Boolean) C22383.m49650(new Callable() { // from class: l.ܺ᩷ۚ
                @Override // java.util.concurrent.Callable
                public final Object call() {
                    return Boolean.valueOf(this.f52254.m40896());
                }
            }, Boolean.FALSE, 500)).booleanValue();
        }
        return m40896();
    }

    /* JADX INFO: renamed from: ۘۨ, reason: not valid java name and contains not printable characters */
    public final C12651 m40901() {
        C12651 c12651 = this.f55916;
        C13638.requireNonNull(c12651);
        return c12651;
    }
}
