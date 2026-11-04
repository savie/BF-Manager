.class public final Ll/ܶ۠᩵;
.super Ll/۠ۜ᩵;
.source "HAYQ"


# instance fields
.field public final ۟:Ll/᩻۠᩵;


# direct methods
.method public constructor <init>(Ll/᩻۠᩵;)V
    .locals 0

    .line 1455
    invoke-direct {p0}, Ll/۠ۜ᩵;-><init>()V

    .line 1454
    iput-object p1, p0, Ll/ܶ۠᩵;->۟:Ll/᩻۠᩵;

    return-void
.end method


# virtual methods
.method public final ᩷(Ljava/lang/Throwable;)V
    .locals 1

    .line 1457
    invoke-virtual {p0}, Ll/᩷۬᩵;->ۧ()Ll/ܳ۬᩵;

    move-result-object p1

    iget-object v0, p0, Ll/ܶ۠᩵;->۟:Ll/᩻۠᩵;

    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 269
    invoke-virtual {p1}, Ll/ܳ۬᩵;->ܳ()Ljava/util/concurrent/CancellationException;

    move-result-object p1

    .line 1457
    invoke-virtual {v0, p1}, Ll/᩻۠᩵;->ۙ(Ljava/util/concurrent/CancellationException;)V

    return-void
.end method
