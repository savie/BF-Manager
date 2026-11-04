.class public final Ll/ۜ᩷᩵;
.super Ll/۬᩷᩵;
.source "SIWD"


# instance fields
.field public final ۙ:Ll/֨ۤ᩵;


# direct methods
.method public constructor <init>(Ll/֨ۤ᩵;)V
    .locals 0

    .line 6
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 11
    iput-object p1, p0, Ll/ۜ᩷᩵;->ۙ:Ll/֨ۤ᩵;

    return-void
.end method


# virtual methods
.method public final ۙ(Ll/۟ۤ᩵;)Ll/֨ۤ᩵;
    .locals 4

    .line 17
    iget-object v0, p0, Ll/ۜ᩷᩵;->ۙ:Ll/֨ۤ᩵;

    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object v1

    .line 18
    invoke-virtual {v0, p1}, Ll/֨ۤ᩵;->ۙ(Ll/۟ۤ᩵;)Ll/֨ۤ᩵;

    move-result-object p1

    .line 19
    invoke-virtual {v1, p1}, Ljava/lang/Class;->isInstance(Ljava/lang/Object;)Z

    move-result v2

    if-eqz v2, :cond_0

    .line 23
    invoke-virtual {v1, p1}, Ljava/lang/Class;->cast(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Ll/֨ۤ᩵;

    return-object p1

    .line 20
    :cond_0
    new-instance v1, Ll/۠ۧ᩵;

    new-instance v2, Ljava/lang/StringBuilder;

    const-string v3, "A state of class "

    invoke-direct {v2, v3}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 21
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object v0

    invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v0, " has duplicated to produce a class of "

    invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object p1

    invoke-virtual {v2, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    .line 11
    invoke-direct {v1, p1}, Ljava/lang/RuntimeException;-><init>(Ljava/lang/String;)V

    .line 21
    throw v1
.end method
