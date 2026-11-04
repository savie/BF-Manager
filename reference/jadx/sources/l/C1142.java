package l;

import android.content.ContentResolver;
import android.database.ContentObserver;
import android.net.Uri;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

/* JADX INFO: renamed from: l.֨ۧ᩸, reason: contains not printable characters */
/* JADX INFO: compiled from: B7B6 */
/* JADX INFO: loaded from: classes2.dex */
public final class C1142 extends ContentResolver {
    @Override // android.content.ContentResolver
    public final String[] getStreamTypes(Uri uri, String str) {
        return new String[0];
    }

    @Override // android.content.ContentResolver
    public final List getPersistedUriPermissions() {
        return Collections.EMPTY_LIST;
    }

    @Override // android.content.ContentResolver
    public final List getOutgoingPersistedUriPermissions() {
        return Collections.EMPTY_LIST;
    }

    @Override // android.content.ContentResolver
    public final void notifyChange(Uri uri, ContentObserver contentObserver) {
        throw m4216("notifyChange");
    }

    @Override // android.content.ContentResolver
    public final void notifyChange(Uri uri, ContentObserver contentObserver, boolean z) {
        throw m4216("notifyChange");
    }

    @Override // android.content.ContentResolver
    public final void notifyChange(Uri uri, ContentObserver contentObserver, int i) {
        throw m4216("notifyChange");
    }

    @Override // android.content.ContentResolver
    public final void notifyChange(Collection collection, ContentObserver contentObserver, int i) {
        throw m4216("notifyChange");
    }

    @Override // android.content.ContentResolver
    public final void takePersistableUriPermission(Uri uri, int i) {
        throw m4216("takePersistableUriPermission");
    }

    @Override // android.content.ContentResolver
    public final void releasePersistableUriPermission(Uri uri, int i) {
        throw m4216("releasePersistableUriPermission");
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static SecurityException m4216(String str) {
        return new SecurityException("Decryptor ContentResolver denied: ".concat(str));
    }
}
