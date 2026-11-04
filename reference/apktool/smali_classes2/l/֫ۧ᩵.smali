.class public final Ll/֫ۧ᩵;
.super Ljava/lang/Object;
.source "76EN"

# interfaces
.implements Ljava/util/Comparator;


# static fields
.field public static final ܰ:Ll/֫ۧ᩵;


# direct methods
.method public static constructor <clinit>()V
    .locals 1

    .line 217
    new-instance v0, Ll/֫ۧ᩵;

    .line 216
    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    .line 217
    sput-object v0, Ll/֫ۧ᩵;->ܰ:Ll/֫ۧ᩵;

    return-void
.end method


# virtual methods
.method public final compare(Ljava/lang/Object;Ljava/lang/Object;)I
    .locals 0

    .line 216
    check-cast p1, Ll/ۧۧ᩵;

    check-cast p2, Ll/ۧۧ᩵;

    .line 221
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    invoke-virtual {p2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    const/4 p1, 0x0

    .line 142
    throw p1
.end method
