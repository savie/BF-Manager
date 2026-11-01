package l;

import android.app.Notification;
import android.app.Person;

/* JADX INFO: renamed from: l.᩵֡, reason: contains not printable characters */
/* JADX INFO: compiled from: J5UB */
/* JADX INFO: loaded from: classes4.dex */
public final class C19101 {
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static Notification.Action.Builder m43865(Notification.Action.Builder builder, int i) {
        return builder.setSemanticAction(i);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static Notification.Builder m43866(Notification.Builder builder, Person person) {
        return builder.addPerson(person);
    }
}
