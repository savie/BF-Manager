.class public final synthetic Ll/ᩴۡۙ;
.super Ljava/lang/Object;
.source "38V0"

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field public final synthetic ܰ:Ll/۫ۡۙ;

.field public final synthetic ᩶:Ljava/lang/Object;


# direct methods
.method public synthetic constructor <init>(Ll/۫ۡۙ;Ll/ۚۡۙ;)V
    .locals 0

    .line 0
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Ll/ᩴۡۙ;->ܰ:Ll/۫ۡۙ;

    iput-object p2, p0, Ll/ᩴۡۙ;->᩶:Ljava/lang/Object;

    return-void
.end method


# virtual methods
.method public final run()V
    .locals 3

    .line 194
    iget-object v0, p0, Ll/ᩴۡۙ;->ܰ:Ll/۫ۡۙ;

    iget v1, v0, Ll/۫ۡۙ;->ۤ:I

    iget-object v0, v0, Ll/۫ۡۙ;->᩷:Ll/۠ۙ᩷;

    iget-object v2, p0, Ll/ᩴۡۙ;->᩶:Ljava/lang/Object;

    invoke-interface {v2, v1, v0}, Ll/ۚۡۙ;->᩷(ILl/۠ۙ᩷;)V

    return-void
.end method
