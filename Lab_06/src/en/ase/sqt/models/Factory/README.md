# EN

You’re developing a cross-platform document editing application (like a simplified Google Docs). Users can export their documents in multiple formats:

- PDF
- DOCX
- HTML

Each format requires a different export implementation, but they are all part of the same framework.
- The export type is selected by the user at runtime from an UI.
- The UI component handling the export isn't aware of how each export type is implemented.
- The design should allow the export system to be easily extended when new formats (like Markdown or TXT) are introduced, without modifying the UI logic.


# RO

Trebuie să dezvoltați o aplicație de editare a documentelor cross-platform (similară cu o versiune simplificată de Google Docs). Utilizatorii pot exporta documentele în mai multe formate:
- PDF
- DOCX
- HTML

Fiecare format necesită o implementare diferită pentru export, dar toate fac parte din același framework.
- Tipul de export este selectat de utilizator la runtime, prin intermediul unui UI.
- Componenta UI care se ocupă de export nu are informații despre cum este implementat fiecare tip de export.
- Designul ar trebui să permită extinderea facilă a sistemului de export atunci când se introduc noi tipuri de documente (cum ar fi Markdown sau TXT), fără a modifica logica UI-ului.